package com.scalefocus.omv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalefocus.omv.db.dao.UserDao;
import com.scalefocus.omv.db.model.User;

@Service
public class EmployeeQuestionnaireService {
	@Autowired
	private UserDao userDao;

	// TODO this is a test method
	public void createUser(String lastname, String firstname, String username, String password) {
		User user = new User(lastname ,firstname, username,password );
		System.out.println("TBD before invoke persist");
		userDao.persist(user);
	}

}
