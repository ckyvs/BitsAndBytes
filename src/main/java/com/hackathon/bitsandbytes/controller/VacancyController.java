package com.hackathon.bitsandbytes.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hackathon.bitsandbytes.entity.Vacancy;
import com.hackathon.bitsandbytes.entity.projections.VacancyProjection;
import com.hackathon.bitsandbytes.services.VacancyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VacancyController {

	@Autowired
	VacancyService vacancyService;

	@GetMapping("/api/vacancies")
	public List<Vacancy> getAllVacancies() {
		return vacancyService.getAllVacancies();
	}

	@PostMapping("/api/vacancy")
	public ResponseEntity<Object> createVacancy(@RequestBody VacancyProjection vacancy) {
		Vacancy savedvacancy = vacancyService.addVacancy(vacancy);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(savedvacancy.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@PutMapping("/api/vacancy/{id}")
	public ResponseEntity<Object> updateVacancy(@RequestBody String vacancyStatus, @PathVariable long id) {

		vacancyService.updateVacancyDetails(vacancyStatus, id);

		return ResponseEntity.ok().build();
	}

}
