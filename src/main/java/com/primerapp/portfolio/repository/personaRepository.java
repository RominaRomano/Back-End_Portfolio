package com.primerapp.portfolio.repository;

import com.primerapp.portfolio.model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository <persona,Long> {
}