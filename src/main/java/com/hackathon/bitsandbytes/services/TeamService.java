package com.hackathon.bitsandbytes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.bitsandbytes.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	TeamRepository teamRepository;
	
	
	
}
