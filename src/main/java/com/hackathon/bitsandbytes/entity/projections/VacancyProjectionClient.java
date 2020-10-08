package com.hackathon.bitsandbytes.entity.projections;

public class VacancyProjectionClient {
	private Long id;
	private String domain;
	private String team;
	private String role;
	private String status;

	public Long getId() {
		return id;
	}
	
	public VacancyProjectionClient(Long id, String domain, String team, String role, String status) {
		super();
		this.id = id;
		this.domain = domain;
		this.team = team;
		this.role = role;
		this.status = status;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
