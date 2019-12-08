package com.example.SocialCommunication.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialCommunication.model.User;
import com.example.SocialCommunication.repository.UserRepository;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}


	/*
	 * @Override public void addUser(String firstName, String lastName, String
	 * email, Number mobileNo, Date registrationDate, boolean isDone) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			userRepository.delete(user.get());
		}
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

}
