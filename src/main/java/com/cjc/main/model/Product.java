package com.cjc.main.model;

import java.util.HashSet;
import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer productId;
  private String productName;
  private String productCategory;
  private Float productPrice;
  private Integer productAvailableCount;
  
    @Lob
	private byte[] photo;
  
  @ManyToMany(cascade = CascadeType.MERGE)
  private Set<Dealer> availableDealer=new HashSet<>();
  //@OneToMany(cascade = CascadeType.ALL)
  //private Set<Dealer> availableDealer;
  @OneToOne(cascade = CascadeType.ALL)
  private ProductDetails productDetails;
  
  
  
}
