package com.hackathon.bitsandbytes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.bitsandbytes.entity.Vacancy;
import com.hackathon.bitsandbytes.entity.projections.VacancyProjection;
import com.hackathon.bitsandbytes.entity.projections.VacancyProjectionClient;
import com.hackathon.bitsandbytes.repository.DomainRepository;
import com.hackathon.bitsandbytes.repository.RoleRepository;
import com.hackathon.bitsandbytes.repository.TeamRepository;
import com.hackathon.bitsandbytes.repository.VacancyRepository;

@Service
public class VacancyService {

	@Autowired
	VacancyRepository vacancyRepository;
	
	@Autowired
	DomainRepository domainRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	TeamRepository teamRepository;
	
	
	 
	public List<VacancyProjection> getAllVacancies(){
		return vacancyRepository.findAllProjectedBy();
	}
	 
	public Vacancy addVacancy(VacancyProjectionClient vacancyProjection) {
		Vacancy vacancy = new Vacancy();
		vacancy.setDomain(domainRepository.findDomainByName(vacancyProjection.getDomain()));
		vacancy.setRole(roleRepository.findRoleByName(vacancyProjection.getRole()));
		vacancy.setTeam(teamRepository.findTeamByName(vacancyProjection.getTeam()));
		vacancy.setStatus("Open");
		return vacancyRepository.saveAndFlush(vacancy);
	}
	
	public List<Vacancy> addMultipleVacancies(List<Vacancy> vacancies) {
		List<Vacancy> savedVacancies = (List<Vacancy>) vacancyRepository.saveAll(vacancies);
		return savedVacancies;
	}
	
	public Vacancy updateVacancyDetails(String vacancyStatus, Long id) {
		Vacancy vacancy = vacancyRepository.getOne(id);
		vacancy.setStatus(vacancyStatus);
		return vacancyRepository.saveAndFlush(vacancy);
	}

	public VacancyProjection getVacancy(Long id) {
		return vacancyRepository.findOneProjectedById(id);
	}
	
}
