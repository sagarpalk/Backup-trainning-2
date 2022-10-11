package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.User;

@Service
public class UserService {

	private List<User> userList = new ArrayList<>();

	public void addUserAndLogin(User user) {

		userList.add(user);
		System.out.println(userList);

	}
}
