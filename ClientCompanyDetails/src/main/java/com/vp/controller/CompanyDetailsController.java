package com.vp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.ribbon.proxy.annotation.Http;
import com.vp.model.CompanyDetails;
import com.vp.service.CompanyDetailsService;

@RestController
@CrossOrigin(origins ="http://localhost:4200",maxAge = 3600)
public class CompanyDetailsController {
	
	@Autowired
	CompanyDetailsService companyDetailsService;
	
	@GetMapping("/companyDetails")
	public List<CompanyDetails> getCompanyDetails(){
		return companyDetailsService.getAllCompanyDetails();
	}
	
	@PostMapping("/companyDetail")
	public void saveCompanyDetails(@RequestBody CompanyDetails companyDetails) {
		companyDetailsService.saveCompanyDetails(companyDetails);
	}
	
}