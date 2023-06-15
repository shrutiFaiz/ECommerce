package com.cjc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product 
{
	@Id
  private int productId;
  private String productCategory;
  private float productPrice;
  private int productAvailableCount;
  private int productRating;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<Dealer> availableDealer;
  @OneToOne(cascade = CascadeType.ALL)
  private Product productDetails;
  
  
  
}
