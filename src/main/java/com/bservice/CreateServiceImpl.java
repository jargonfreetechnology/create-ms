package com.bservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdao.IcreateDao;
import com.domain.User;

@Service
@Transactional
public class CreateServiceImpl implements IcreateService {
	
	@Autowired
	private IcreateDao userDaoImpl;	

	/* Create a record */
	@Override
	public User createUser(User user) {
		user = userDaoImpl.save(user);
		System.out.println("Record created!!!");
		return user;
	}

	@Override
	public String toString() {
		return "CreateServiceImpl";
	}

}