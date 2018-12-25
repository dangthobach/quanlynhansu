package vn.qlns.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import vn.qlns.model.Bu;

public interface BuRepository extends CrudRepository<Bu, String> {

	
}
