package com.vp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.UserDatabase;
import com.vp.service.UserDatabaseService;

@RestController
@CrossOrigin(origins ="http://localhost:4200",maxAge = 3600)
public class UserDatabaseController {
	
	@Autowired
	UserDatabaseService userDatabaseService;
	
	@GetMapping("/userDatabases")
	public List<UserDatabase> getStudents(){
		return userDatabaseService.getAllStudent();
	}
	
	@PostMapping("/userDatabase")
	public void insertStudent(@RequestBody UserDatabase userDatabase) {
		userDatabaseService.saveStudent(userDatabase);
	}
	
}