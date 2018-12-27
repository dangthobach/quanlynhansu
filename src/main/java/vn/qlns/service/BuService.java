package vn.qlns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.qlns.model.Bu;
import vn.qlns.model.StaffDTO;
import vn.qlns.repository.BuRepository;

@Service
public class BuService {

	@Autowired
	private BuRepository buRepository;

	@PersistenceContext
	private EntityManager entityManager;

	public List<Bu> findAll() {

		ArrayList<Bu> buList = (ArrayList<Bu>) buRepository.findAll();
		List<Bu> activeBuList = new ArrayList<>();
		buList.forEach(bu -> activeBuList.add(bu));

		return activeBuList;

	}

	public Optional<Bu> findOne(String id) {
		return buRepository.findById(id);
	}

	public void save(Bu bu) {
		buRepository.save(bu);
	}

	public void deletebyId(String bu) {
		buRepository.deleteById(bu);
	}

	public List<StaffDTO> listAll() {

		String sql = "SELECT b.bu_Name,p.project_Name, s.staff_Name, s.descr FROM Bu b inner join Project p on b.bu_id=p.bu_id inner join Staff s on b.bu_id=s.bu_id";
		List<StaffDTO> list = entityManager.createNativeQuery(sql).unwrap(org.hibernate.query.Query.class)
				.setResultTransformer( Transformers.aliasToBean( StaffDTO.class ))
				.getResultList();
//		ArrayList<StaffDTO> arr = new ArrayList<StaffDTO>();
//		for (Object object : list) {
//			StaffDTO staffDTO = new StaffDTO();
//			staffDTO.setBu_name(list.get(0));
//			staffDTO.setProj_name(list.get(1).toString());
//			staffDTO.setStaff_name(list.get(2).toString());
//			staffDTO.setDesc(list.get(3).toString());
//			arr.add(staffDTO);
//		}
		return list;
	}
	
	
	public List<StaffDTO> findbyFields(String key) {

		List<StaffDTO> list= new ArrayList<StaffDTO>();
		if (key==null) {
			 list = entityManager.createNativeQuery("SELECT b.bu_Name,p.project_Name, s.staff_Name, s.descr FROM quanlynhansu.bu b inner join quanlynhansu.project p on b.bu_ID=p.bu_ID inner join quanlynhansu.staff s on b.bu_ID=s.bu_ID")
					 .unwrap(org.hibernate.query.Query.class)
					.setResultTransformer( Transformers.aliasToBean( StaffDTO.class ))
					.getResultList();
		}
		else {
			 list = entityManager.createNativeQuery("SELECT b.bu_Name,p.project_Name, s.staff_Name, s.descr FROM quanlynhansu.bu b inner join quanlynhansu.project p on b.bu_ID=p.bu_ID inner join quanlynhansu.staff s on b.bu_ID=s.bu_ID where p.project_Name like :a")
					 .setParameter("a", "%"+key+"%")
					 .unwrap(org.hibernate.query.Query.class)
					.setResultTransformer(Transformers.aliasToBean( StaffDTO.class ))
					.getResultList();
		}
		

		return list;
	}
	
}
