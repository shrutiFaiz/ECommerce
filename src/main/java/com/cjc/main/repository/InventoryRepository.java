package com.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Product;
@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer>
{
  public Product  findByProductName(String productName);
  public Product  deleteByProductId(Integer productId);
  public List<Product> findByProductCategory(String productCategory);
    
}
