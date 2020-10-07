package com.hackathon.bitsandbytes.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bitsandbytes.entity.Team;


@Repository
@Transactional
public interface TeamRepository extends JpaRepository<Team,Long> {
	
	public Team findTeamByName(String name);
}
