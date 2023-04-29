package com.Registeration.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Registeration.demo.model.Registeration;

public interface RegisterationRepository extends JpaRepository<Registeration,String> {

}
