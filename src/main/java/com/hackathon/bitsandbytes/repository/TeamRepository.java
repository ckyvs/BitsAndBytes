package com.hackathon.bitsandbytes.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface TeamRepository extends JpaRepository<TeamRepository,Long> {

}
