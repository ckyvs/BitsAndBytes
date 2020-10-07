package com.hackathon.bitsandbytes.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bitsandbytes.entity.Role;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Role,Long>{

}
