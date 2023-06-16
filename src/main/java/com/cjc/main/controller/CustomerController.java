package com.cjc.main.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Customer;
import com.cjc.main.serviceinterface.CustomerServiceI;

@RestController
public class CustomerController 
{
	@Autowired
	CustomerServiceI csi;
 
    	@PostMapping ("/saveCustomer")
    	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c)
    	{
    		csi.saveCustomer(c);
    		return new ResponseEntity<Customer>(c,HttpStatus.CREATED) ;
    	}
}
