package com.cjc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
  private int dealerId;
  private String dealerName;
  private String dealerEmail;
  private long dealerMobileNumber;
  @OneToOne(cascade = CascadeType.ALL)
  private Address dealerAddress;
  @OneToOne(cascade = CascadeType.ALL)
  private BankDetails dealerBankDetails;
  
}
