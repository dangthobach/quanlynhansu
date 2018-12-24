package vn.qlns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vn.qlns.model.Staff;
import vn.qlns.repository.StaffRepository;



public class StaffService {
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
