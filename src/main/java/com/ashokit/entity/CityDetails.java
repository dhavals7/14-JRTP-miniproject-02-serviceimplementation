package com.ashokit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class CityDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "CITY_ID")
	private Integer cityId;

	@Column(name = "CITY_NAME")
	private String cityName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "userId")
	private User user;


}
