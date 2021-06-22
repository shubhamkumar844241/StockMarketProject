package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.UserDatabase;
import com.vp.repository.UserDatabaseRepository;

@Service
@Transactional
public class UserDatabaseService {
    
	@Autowired
	UserDatabaseRepository userDatabaseRepository;
	
	public List<UserDatabase> getAllStudent(){
		return (List<UserDatabase>) userDatabaseRepository.findAll();
	}
	
	public void saveStudent(UserDatabase userDatabase) {
		userDatabaseRepository.save(userDatabase);
	}
	
}