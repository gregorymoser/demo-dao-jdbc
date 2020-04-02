package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert (Department obj);
	void uodate (Department obj);
	void deleteByID (Integer id);
	Department fidnById (Integer id);
	List <Department> findAll();
}
