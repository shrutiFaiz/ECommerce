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
public class BankDetails 
{
	@Id
   private long bankAccountNumber;
   private String bankName;
   private String branchName;
   private String ifscNumber;
   private long cardNumber;
   
}
