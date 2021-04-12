package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CountryDetails;

public interface CountryRepository extends JpaRepository<CountryDetails, Serializable> {
	
	public List<CountryDetails> findByAll();

}
