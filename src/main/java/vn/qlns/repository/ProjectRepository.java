package vn.qlns.repository;

import org.springframework.data.repository.CrudRepository;

import vn.qlns.model.Project;

public interface ProjectRepository extends CrudRepository<Project, String> {

}
