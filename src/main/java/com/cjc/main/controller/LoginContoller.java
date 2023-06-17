package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.User;
import com.cjc.main.serviceinterface.LoginServiceI;
@RequestMapping("login")
@RestController
public class LoginContoller {
	
	@Autowired
	LoginServiceI ls;
	
	
	@GetMapping("/getsingledata/{userName}/{password}")
	public ResponseEntity<User> getsingledata(@PathVariable("userName") String userName, @PathVariable("password") String password){
		
		System.out.println("username "+userName);
		
		User u=ls.getsingledata(userName,password);
		System.out.println("Don!!!e");
		
		return new ResponseEntity<User>(u,HttpStatus.OK);

		
	}


}
