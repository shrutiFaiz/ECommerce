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
public class Address
{
	@Id
  private int addressId;
  private String areaName;
  private String cityName;
  private String districtName;
  private String landMark;
  private String stateName;
  private int pinCodeNumber;
}
