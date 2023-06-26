package com.cjc.main.serviceinterface;

import java.util.List;

import com.cjc.main.model.Customer;
import com.cjc.main.model.Product;

public interface CustomerServiceI 
{
  public void saveCustomer(Customer c);

  public List<Product> getAllProduct();

  public List<Product> getProductByCategory(String productCategory);
}
