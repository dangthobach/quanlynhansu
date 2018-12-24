package vn.qlns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vn.qlns.model.Skill;
import vn.qlns.repository.SkillRepository;

public class SkillService {
private SkillRepository skillRepository;
	
	public List<Skill> findAll(){
		List<Skill> skillList = (List<Skill>) skillRepository.findAll();
		List<Skill> activeskillList = new ArrayList<>();
		
		skillList.forEach(skill->activeskillList.add(skill));
		
		return activeskillList;
		
	}
	
	public Optional<Skill> findOne(String id) {
		return skillRepository.findById(id);
	}
	
	public void save(Skill skill) {
		skillRepository.save(skill);
	}
	
	public void deletebyId(String skill) {
		skillRepository.deleteById(skill);
		
	}
}
