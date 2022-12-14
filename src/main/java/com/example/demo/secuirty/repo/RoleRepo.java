package com.example.demo.secuirty.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.secuirty.model.Role;

@Repository
public interface RoleRepo  extends JpaRepository <Role, Long>{

	Optional<Role> findById(Long id);
	
}
