package com.example.SocialCommunication.service;


import java.util.List;
import java.util.Optional;

import com.example.SocialCommunication.model.User;

public interface IUserService {
	
	List<User> findAllUser();
	
	Optional<User> findUserById(Long id);
	
//	void addUser(String firstName, String lastName, String email,Number mobileNo, Date registrationDate, boolean isDone);
	
	void updateUser(User user);
	
	void deleteUser(long id);
	
	void saveUser(User user);


}
