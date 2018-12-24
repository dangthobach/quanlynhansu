package vn.qlns.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.qlns.model.Bu;
import vn.qlns.repository.BuRepository;

@Service
public class BuService {
	
	@Autowired
	private BuRepository buRepository;
	
	public List<Bu> findAll(){
		
		ArrayList<Bu> buList = (ArrayList<Bu>) buRepository.findAll();
		List<Bu> activeBuList = new ArrayList<>();
		buList.forEach(bu->activeBuList.add(bu));
		
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
	
	
}
