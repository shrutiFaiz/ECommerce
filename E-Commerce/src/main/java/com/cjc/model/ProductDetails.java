package com.cjc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
  private int productDetailsId;
  private String manufacturerName;
  private String modelNumber;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<ProductFeatures> productfeatures;
  
}
