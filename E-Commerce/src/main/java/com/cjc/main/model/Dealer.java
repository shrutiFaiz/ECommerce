package com.cjc.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Dealer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer dealerId;
  private String dealerName;
  private String dealerEmail;
  private Long dealerMobileNumber;
  @OneToOne(cascade = CascadeType.ALL)
  private Address dealerAddress;
  @OneToOne(cascade = CascadeType.ALL)
  private BankDetails dealerBankDetails;
  
}
