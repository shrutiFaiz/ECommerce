package com.cjc.main.serviceinterface;

import org.springframework.stereotype.Service;

import com.cjc.main.model.User;

public interface LoginServiceI {

	public User getsingledata(String userName, String password) ;
		
}