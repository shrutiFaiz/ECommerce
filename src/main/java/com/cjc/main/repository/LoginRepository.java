package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.User;
@Repository
public interface LoginRepository extends CrudRepository<User, Integer>{
	
	
	
	public User findByUserNameAndPassword(String userName, String password);
}