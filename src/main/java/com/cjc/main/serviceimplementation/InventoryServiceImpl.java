package com.cjc.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Product;
import com.cjc.main.repository.InventoryRepository;
import com.cjc.main.serviceinterface.InventoryServiceI;
@Service
public class InventoryServiceImpl implements InventoryServiceI 
{
	@Autowired
    InventoryRepository ir;
	@Override
	public void saveProduct(Product p)
	{
		// TODO Auto-generated method stub
		ir.save(p);
	}
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return ir.findAll();
	}
	@Override
	public Product getSingleProduct(String productName) {
		// TODO Auto-generated method stub
		return ir.findByProductName(productName);
	}
	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		ir.deleteByProductId(productId);
	}

}
