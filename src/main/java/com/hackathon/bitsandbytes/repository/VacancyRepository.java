package com.hackathon.bitsandbytes.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bitsandbytes.entity.Vacancy;
import com.hackathon.bitsandbytes.entity.projections.VacancyProjection;



@Repository
@Transactional
public interface VacancyRepository extends JpaRepository<Vacancy,Long> {

	public List<VacancyProjection> findAllProjectedBy();
}
