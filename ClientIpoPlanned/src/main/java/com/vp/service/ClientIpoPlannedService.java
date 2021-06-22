package com.vp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vp.model.ClientIpoPlanned;
import com.vp.repository.ClientIpoPlannedRepository;

@Service
@Transactional
public class ClientIpoPlannedService {
	
	@Autowired
	ClientIpoPlannedRepository clientipoplannedRepository;
	
	public List<ClientIpoPlanned> getAllClientIpoPlanned(){
		return (List<ClientIpoPlanned>) clientipoplannedRepository.findAll();
	}
	
	public void saveClientIpoPlanned(ClientIpoPlanned clientipoplanned) {
		clientipoplannedRepository.save(clientipoplanned);
	}

}
