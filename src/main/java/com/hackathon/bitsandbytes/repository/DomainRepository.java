package com.hackathon.bitsandbytes.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bitsandbytes.entity.Domain;

@Repository
@Transactional
public interface DomainRepository extends JpaRepository<Domain,Long>{
	public Domain findDomainByName(String name);
}
