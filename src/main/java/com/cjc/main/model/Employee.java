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
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private Integer employeeId;
   private String employeeName;
   @OneToOne(cascade = CascadeType.ALL)
   private Address employeeAddress;
   private Long employeeMobileNumber;
   private String employeeEmail;
   @OneToOne(cascade = CascadeType.ALL)
   private User userDetails;
}
