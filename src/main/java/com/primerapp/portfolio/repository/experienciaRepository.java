package com.primerapp.portfolio.repository;

import com.primerapp.portfolio.model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository <experiencia,Long> {
}