package com.primerapp.portfolio.repository;

import com.primerapp.portfolio.model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository <educacion,Long> {
}