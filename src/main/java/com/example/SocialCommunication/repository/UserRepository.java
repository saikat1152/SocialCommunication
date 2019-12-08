package com.example.SocialCommunication.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SocialCommunication.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	


}
