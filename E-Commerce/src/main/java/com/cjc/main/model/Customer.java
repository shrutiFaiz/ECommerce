package com.cjc.main.model;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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


public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer customerId;
  private String customerName;
  private String customerEmail;
  private Long customerMobileNumber;
  @OneToOne(cascade = CascadeType.ALL)
  private User userDetails;
  @OneToOne(cascade = CascadeType.ALL)
  private Address customerAddress;
  @OneToOne(cascade = CascadeType.ALL)
  private BankDetails customerBankDetails;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<Product> wishlist;
  @OneToMany(cascade = CascadeType.ALL)
  private Set<OrderDetails> orderHistory;
}
