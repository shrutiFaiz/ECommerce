package com.cjc.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;
import com.cjc.main.repository.CustomerRepository;
import com.cjc.main.repository.InventoryRepository;
import com.cjc.main.serviceinterface.CustomerServiceI;
@Service
public class CustomerServiceImpl implements CustomerServiceI 
{
	
    @Autowired 
	CustomerRepository cr;
    
    @Autowired
    InventoryRepository ir;
	@Override
	public void saveCustomer(Customer c)
	{
		// TODO Auto-generated method stub
		cr.save(c);
	}
	@Override
	public List<Product> getAllProduct() {
		
		return ir.findAll();
	}
	@Override
	public List<Product> getProductByCategory(String productCategory) {
		
		return ir.findByProductCategory(productCategory);
	}
	
}
