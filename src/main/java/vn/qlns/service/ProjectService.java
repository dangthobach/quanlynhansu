package vn.qlns.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vn.qlns.model.Project;
import vn.qlns.repository.ProjectRepository;

public class ProjectService {
private ProjectRepository projectRepository;
	
	public List<Project> findAll(){
		List<Project> projectList = (List<Project>) projectRepository.findAll();
		List<Project> activeprojectList = new ArrayList<>();
		
		projectList.forEach(project->activeprojectList.add(project));
		
		return activeprojectList;
		
	}
	
	public Optional<Project> findOne(String id) {
		return projectRepository.findById(id);
	}
	
	public void save(Project project) {
		projectRepository.save(project);
	}
	
	public void deletebyId(String project) {
		projectRepository.deleteById(project);
		
	}
}
