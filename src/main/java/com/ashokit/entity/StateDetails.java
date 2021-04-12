package com.ashokit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class StateDetails {

	@Id
	@GeneratedValue
	@Column(name = "STATE_ID")
	private Integer stateId;

	@Column(name = "STATE_NAME")
	private String stateName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private User user;

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
