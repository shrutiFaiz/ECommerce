package com.cjc.main.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer productDetailsId;
  private String manufacturerName;
  private String modelNumber;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<ProductFeatures> productfeatures;
  
}
