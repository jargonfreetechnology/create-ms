package com.acontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bservice.IcreateService;
import com.domain.User;
import com.proxy.ReaderProxy;

@RestController
public class CreateController {
	
	@Autowired
	private IcreateService createService;
	
    @Autowired
    private ReaderProxy readerProxy;

	@PostMapping("/create")
	public List<User> create(@RequestBody User user) {
		
		createService.createUser(user);

		List<User> userList = readerProxy.read();

		return userList;

	}

}