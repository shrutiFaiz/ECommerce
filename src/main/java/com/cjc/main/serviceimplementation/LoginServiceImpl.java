package com.cjc.main.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.User;
import com.cjc.main.repository.LoginRepository;
import com.cjc.main.serviceinterface.LoginServiceI;
@Service
public class LoginServiceImpl implements LoginServiceI {

	@Autowired
	LoginRepository loginrepository;
	
	
	
	@Override
	public User getsingledata(String userName, String password) {
		
		return loginrepository.findByUserNameAndPassword(userName, password);
	}

}
