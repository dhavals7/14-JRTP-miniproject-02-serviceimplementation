package com.ashokit.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ashokit.entity.CountryDetails;
import com.ashokit.entity.StateDetails;
import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	private UserRepository repository;

	public UserServiceImplementation(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean registerUser(User userObject) {

		User user1 = repository.save(userObject);

		if (user1.getUserId() != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean unlockAccount(UnlockAccount unlockAccountObject) {

		UnlockAccount unlockobj = repository.save(unlockAccountObject);

		if (unlockobj.getUnlockAccountId() != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean forgotPassword(User userEmail) {

		User userobj = repository.findByUserEmail(userEmail);
		if (userobj.getUserEmail() != null)
			return true;
		else
			return false;

	}

	@Override
	public String loginCheck(User userEmail, User userPassword) {
		return null;
	}

	@Override
	public User getUserByEmail(User userEmail) {
		User userobj = repository.findByUserEmail(userEmail);
		return userobj;
	}

	@Override
	public Map<Integer, String> getAllCountries() {

		List<CountryDetails> countryList = repository.findAll();
		Map<Integer, String> countryMap = new HashMap<>();
		for (CountryDetails country : countryList) {
			countryMap.put(country.getCountryId(), country.getCountryName());
		}
		return countryMap;
	}

	@Override
	public Map<Integer, String> getAllStates(Integer countryId) {

		List<StateDetails> stateList = repository.findStateDetailsByCountryId(countryId);
		Map<Integer, String> stateMap = new HashMap<>();
		for (StateDetails state : stateList) {
			stateMap.put(state.getStateId(), state.getStateName());
		}
		return stateMap;
	}

	@Override
	public Map<Integer, String> getAllCities(Integer stateId) {
		List<CityDetails> cityList = repository.findCityDetailsByCityId(stateId);
		Map<Integer, String> cityMap = new HashMap<>();
		for (CityDetails city : cityList) {
			cityMap.put(city.getCityId(), city.getCityName());
		}
		return cityMap;
	}

}
