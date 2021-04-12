package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.User;
import com.ashokit.service.UnlockAccount;

public interface UserRepository extends JpaRepository<User, Serializable> {
	
	public User findByUserEmail(User userName);

	public UnlockAccount save(UnlockAccount unlockAccountObject);
	
}
