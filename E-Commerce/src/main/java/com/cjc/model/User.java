package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User 
{
	@Id
	private int userId;
	private String userName;
	private String password;
	private String userType;
	

}
