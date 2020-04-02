package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	void insert (Seller obj);
	void uodate (Seller obj);
	void deleteByID (Integer id);
	Seller fidnById (Integer id);
	List <Seller> findAll();
}
