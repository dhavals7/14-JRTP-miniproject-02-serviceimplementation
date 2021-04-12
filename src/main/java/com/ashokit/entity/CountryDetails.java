package com.ashokit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COUNTRY_DETAILS")
public class CountryDetails {
	@Id
	@GeneratedValue
	@Column(name = "COUNTRY_ID")
	private Integer countryId;

	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "userId")
	private User user;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
	
	


