package com.cjc.main.serviceinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.main.model.Product;

public interface InventoryServiceI 
{
  public void saveProduct(Product p);

  public List<Product> getProduct();
  
  public Product getSingleProduct(String productName);

public void deleteProduct(Integer productId);
}
 