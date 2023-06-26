package com.cjc.main.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;
import com.cjc.main.serviceinterface.CustomerServiceI;

@CrossOrigin("*")
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
    	
    	//search by category api
    	
    	//view all products
    	@GetMapping("/viewAllProduct")
    	public ResponseEntity<List<Product>>getProduct()
    	 {

    	    List<Product>list= (List<Product>) csi.getAllProduct();
    	    
    	    return new ResponseEntity<List<Product>>(list,HttpStatus.OK) ;
    			
    	 }
    	
    	@GetMapping("/searchByCategoryName/{productCategory}")
    	public ResponseEntity<List<Product>> getSingleProduct(@PathVariable ("productCategory") String productCategory)
    	
    	{
    		List<Product> list= csi.getProductByCategory(productCategory);
    	   
    	   return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
    	}

        
    	
}
