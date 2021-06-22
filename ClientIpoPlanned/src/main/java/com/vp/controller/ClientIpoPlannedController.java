package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.ClientIpoPlanned;
import com.vp.service.ClientIpoPlannedService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class ClientIpoPlannedController {
	@Autowired
	ClientIpoPlannedService studentService;
	
	@GetMapping("/students")
	public List<ClientIpoPlanned> getClientIpoPlanned(){
		return studentService.getAllClientIpoPlanned();
	}
	
	@PostMapping("/student")
	public void insertStudent(@RequestBody ClientIpoPlanned student) {
		studentService.saveClientIpoPlanned(student);
	}
	
}
