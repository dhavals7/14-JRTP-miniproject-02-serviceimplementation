package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.CityDetails;

public interface CityRepository extends JpaRepository<CityDetails, Serializable> {

}
