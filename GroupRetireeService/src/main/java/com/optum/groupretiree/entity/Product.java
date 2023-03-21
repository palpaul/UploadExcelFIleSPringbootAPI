package com.optum.groupretiree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private String productDesc;
	private Integer productPrice;
	
//	private String employerGroup;	
//	private Integer branchId;
//	Bill Group Number;
//	Employer Account ID;
//	Medicare Number;
//	First Name;
//	Middle Name;
//	Last Name;
//	DOB	Gender;
//	Retiree Type; 
//	Address Line 1;
//	Address Line 2;
//	City;
//	State Cd;
//	Zip Cd;
//	County;
//	Mailing Address Line 1;
//	Mailing Address Line 2;
//	Mailing City;
//	Mailing State Cd;
//	
//	Mailing Zip Cd;
//	Primary Phone Number;
//	Secondary Phone Number;
//	Individual Eligibility Date 

	

}
