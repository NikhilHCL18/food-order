package com.hcl.foodorder.domain.restaurant;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.hcl.foodorder.domain.common.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * 
 * @author Harishkumar Reddy
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String mobileNumber;
	private Address address;
	private Boolean isActive;
	private Boolean isOpen;
	
}
