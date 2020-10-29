package com.bservice;

import org.springframework.stereotype.Service;

import com.domain.User;

@Service
public interface IcreateService {

	/* Create a record */
	public User createUser(User user);

}