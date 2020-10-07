package com.hackathon.bitsandbytes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.bitsandbytes.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository rolerepository;
	
}
