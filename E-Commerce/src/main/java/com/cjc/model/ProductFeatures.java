package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductFeatures 
{
  @Id
  private String featureId;
  private String featureName;
  private String featureValue;
  
}
