package com.anil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mobiles {
	@Id
	private Integer mobileId;
	private Integer mobilePrice;
	private String mobileName;
	
	

}
