package com.hackathon.bitsandbytes.entity.projections;

import com.hackathon.bitsandbytes.entity.Domain;
import com.hackathon.bitsandbytes.entity.Role;
import com.hackathon.bitsandbytes.entity.Team;

public class VacancyProjection {
	
	private Long id;
	private String domain;
	private String team;
	private String role;
	private String status;
	public VacancyProjection(Long id, Domain domain, Team team, Role role, String status) {
		super();
		this.id = id;
		this.domain = domain.getName();
		this.team = team.getName();
		this.role = role.getName();
		this.status = status;
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(Domain domain) {
		this.domain = domain.getName();
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team.getName();
	}
	public String getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role.getName();
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
