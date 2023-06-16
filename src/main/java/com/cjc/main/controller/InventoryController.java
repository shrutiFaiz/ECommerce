package com.cjc.main.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.main.model.Product;
import com.cjc.main.serviceinterface.InventoryServiceI;


@RestController
public class InventoryController 
{
	@Autowired
	InventoryServiceI isi;
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product p)
	{
		isi.saveProduct(p);
		
		return new ResponseEntity<Product>(p,HttpStatus.CREATED) ;
		
	}
	
	@GetMapping("/getProduct")
	public ResponseEntity<List<Product>>getProduct()
	 {

	    List<Product>list= (List<Product>) isi.getProduct();
	    
	    return new ResponseEntity<List<Product>>(list,HttpStatus.OK) ;
			
	 }
	@GetMapping("/getSingleProduct")
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
