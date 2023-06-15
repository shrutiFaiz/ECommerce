package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Dealer;
import com.cjc.main.model.Employee;
import com.cjc.main.serviceinterface.AdminServiceI;



@RestController
public class AdminController {
	
	@Autowired
	AdminServiceI asi;
	
//post employeedata	
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e)
	{
		asi.saveEmployee(e);
		
		return new ResponseEntity<Employee>(e,HttpStatus.CREATED) ;
		
	}
//view employeelist	
	
	@GetMapping("/getEmployee")
	public ResponseEntity<List<Employee>>getEmployee()
	 {

	    List<Employee>list= (List<Employee>) asi.getEmployee();
	    
	return new ResponseEntity<List<Employee>>(list,HttpStatus.OK) ;
			
		}
//add dealer

	@PostMapping("/saveDealer")
	public ResponseEntity<Dealer> saveEmployee(@RequestBody Dealer d)
	{
		asi.saveDealer(d);
		
		return new ResponseEntity<Dealer>(d,HttpStatus.CREATED) ;
		
	}
	
	//view dealer
	@GetMapping("/getDealer")
	public ResponseEntity<List<Dealer>>getDealer()
	 {

	    List<Dealer>list= (List<Dealer>) asi.getDealer();
	    
	return new ResponseEntity<List<Dealer>>(list,HttpStatus.OK) ;
			
		}
	
	}
	

