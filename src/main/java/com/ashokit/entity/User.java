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
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_FIRST_NAME")
	private String userFirstName;

	@Column(name = "USER_LAST_NAME")
	private String userLastName;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_GENERATED_PASSWORD")
	private String userGeneratedPassword;

	@Column(name = "PHONE_NO")
	private Long phoneNo;

	@Column(name = "DATE_OF_BIRTH")
	private Integer dob;

	@Column(name = "GENDER")
	private String gender;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	@Column(name = "USERCOUNTRY_DETAILS")
	private String country;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	@Column(name = "USERSTATE_DETAILS")
	private String state;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	@Column(name = "USERCITY_DETAILS")
	private String city;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserGeneratedPassword() {
		return userGeneratedPassword;
	}

	public void setUserGeneratedPassword(String userGeneratedPassword) {
		this.userGeneratedPassword = userGeneratedPassword;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getDob() {
		return dob;
	}

	public void setDob(Integer dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userGeneratedPassword=" + userGeneratedPassword + ", phoneNo="
				+ phoneNo + ", dob=" + dob + ", gender=" + gender + ", country=" + country + ", state=" + state
				+ ", city=" + city + "]";
	}

}
