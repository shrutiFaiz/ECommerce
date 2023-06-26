package com.cjc.main.controller;

import java.awt.Window;
import java.io.IOException;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.main.model.Product;
import com.cjc.main.serviceinterface.InventoryServiceI;

import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
public class InventoryController 
{
	@Autowired
	InventoryServiceI isi;
	
	  @PostMapping("/addProduct")
	  public ResponseEntity<Product> addProduct(@RequestParam("photo") MultipartFile file,
			  @RequestParam("product") String data) throws IOException {
		  
		  ObjectMapper om=new
					ObjectMapper();
			Product p=om.readValue(data, Product.class);
			
			
			p.setPhoto(file.getBytes());
			
			
		      isi.saveProduct(p);
		      
		      
	  
	      return new ResponseEntity<Product>(p,HttpStatus.CREATED) ;
	  
	  }
	 
	
		/*
		 * public String addProduct(@RequestBody Product p) { isi.saveProduct(p);
		 * 
		 * return "Data Saved Successfully" ; }
		 */
	
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>>getProduct()
	 {

	    List<Product>list= (List<Product>) isi.getProduct();
	    
	    return new ResponseEntity<List<Product>>(list,HttpStatus.OK) ;
			
	 }
	@GetMapping("/getSingleProduct/{productName}")
	public ResponseEntity<Product> getSingleProduct(@PathVariable ("productName") String productName)
	
	{
	   Product  p= isi.getSingleProduct(productName);
	   
	   return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	@PutMapping("/updateproduct/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable ("productId") Integer productId,@RequestBody Product p)
	{
		isi.saveProduct(p);
		return new ResponseEntity<Product>(p,HttpStatus.CREATED) ;
	}
	 
	public ResponseEntity<Product> deleteProduct(@PathVariable ("productId") Integer productId,@RequestBody Product p)
	{
		isi.deleteProduct(productId);
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
}
