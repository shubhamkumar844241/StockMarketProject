package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.CompanyDetails;
import com.vp.repository.CompanyDetailsRepository;

@Service
@Transactional
public class CompanyDetailsService {
    
	@Autowired
	CompanyDetailsRepository companyDetailsRepository;
	
	public List<CompanyDetails> getAllCompanyDetails(){
		return (List<CompanyDetails>) companyDetailsRepository.findAll();
	}
	
	public void saveCompanyDetails(CompanyDetails companyDetails) {
		companyDetailsRepository.save(companyDetails);
	}

	
}