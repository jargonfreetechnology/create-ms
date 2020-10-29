package com.acontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bservice.IcreateService;
import com.domain.User;

@RestController
public class CreateController {
	
	@Autowired
	private IcreateService createService;

	@PostMapping("/create")
	public User create(@RequestBody User user) {
		
		user = createService.createUser(user);

		return user;

	}

}