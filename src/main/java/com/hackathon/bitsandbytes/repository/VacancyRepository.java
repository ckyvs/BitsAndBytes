package com.hackathon.bitsandbytes.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bitsandbytes.entity.Vacancy;



@Repository
@Transactional
public interface VacancyRepository extends JpaRepository<Vacancy,Long> {

}
