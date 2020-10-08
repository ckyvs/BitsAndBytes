package com.hackathon.bitsandbytes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int experience;

	
	public Role() {
		super();
	}

	public Role(Long id, String name, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	

}
