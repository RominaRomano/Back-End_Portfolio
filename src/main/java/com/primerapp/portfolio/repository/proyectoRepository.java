//capa controladora -> capa servicio: Interface -> capa servicio: Clase -> CAPA REPOSITORIO (aquí) -> BD

package com.primerapp.portfolio.repository;

import com.primerapp.portfolio.model.proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proyectoRepository extends JpaRepository <proyecto,Long> {
}