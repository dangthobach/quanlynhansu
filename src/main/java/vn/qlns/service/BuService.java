package vn.qlns.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.qlns.model.Bu;
import vn.qlns.repository.BuRepository;

@Service
public class BuService {
	
	@Autowired
	private BuRepository buRepository;
	
	public Set<Bu> findAll(){
		
		HashSet<Bu> buList = (HashSet<Bu>) buRepository.findAll();
		Set<Bu> activeBuList = new HashSet<>();
		ArrayList array= new ArrayList();
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
