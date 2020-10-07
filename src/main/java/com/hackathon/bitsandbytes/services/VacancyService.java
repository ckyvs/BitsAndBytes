package com.hackathon.bitsandbytes.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.bitsandbytes.entity.Vacancy;
import com.hackathon.bitsandbytes.repository.VacancyRepository;

@Service
public class VacancyService {

	@Autowired
	VacancyRepository vacancyRepository;
	
	
	 List<Vacancy> listOfVacancies = new ArrayList<Vacancy>();
	
	 
	public List<Vacancy> getAllVacancies(){
		List<Vacancy> receivedAllVacancies = vacancyRepository.findAll();
		return receivedAllVacancies;
	}
	 
	 
	//Adding a single vacancy.
	public Vacancy addVacancy(Vacancy vacancy) {
		Vacancy savedvacancy = vacancyRepository.save(vacancy);
		return savedvacancy;
	}
	
	//Adding multiple vacancies at a time;
	public List<Vacancy> addMultipleVacancies(List<Vacancy> vacancies) {
		List<Vacancy> savedVacancies = (List<Vacancy>) vacancyRepository.saveAll(vacancies);
		return savedVacancies;
	}
	
	//Update the vacancy in the repository
	public Vacancy updateVacancyDetails(Vacancy updateVacancyDetails) {
		Vacancy updatedVacancy = vacancyRepository.save(updateVacancyDetails);
		return updatedVacancy;
	}
	
}
