package vn.qlns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.qlns.model.Staff;
import vn.qlns.repository.StaffRepository;


@Service
public class StaffService {
	
	@Autowired
private StaffRepository staffRepository;
	
	public List<Staff> findAll(){
		List<Staff> staffList = (List<Staff>) staffRepository.findAll();
		List<Staff> activestaffList = new ArrayList<>();
		
		staffList.forEach(staff->activestaffList.add(staff));
		
		return activestaffList;
		
	}
	
	public Optional<Staff> findOne(String id) {
		return staffRepository.findById(id);
	}
	
	public void save(Staff staff) {
		staffRepository.save(staff);
	}
	
	public void deletebyId(String staff) {
		staffRepository.deleteById(staff);
		
	}
	
	
}
