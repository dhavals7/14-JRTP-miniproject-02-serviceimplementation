package com.ashokit.service;

import java.util.Map;

import com.ashokit.entity.User;

public interface UserService {

	public boolean registerUser(User userObject);

	public boolean unlockAccount(UnlockAccount unlockAccountOject);

	public boolean forgotPassword(User userEmail);

	public String loginCheck(User userEmail, User userPassword);
	
	public User getUserByEmail(User userEmail);

	public Map<Integer, String> getAllCountries();

	public Map<Integer, String> getAllStates(Integer countryId);

	public Map<Integer, String> getAllCities(Integer stateId);

}
