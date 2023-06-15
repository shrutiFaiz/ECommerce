package com.cjc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer addressId;
  private String areaName;
  private String cityName;
  private String districtName;
  private String landMark;
  private String stateName;
  private Integer pinCodeNumber;
}
