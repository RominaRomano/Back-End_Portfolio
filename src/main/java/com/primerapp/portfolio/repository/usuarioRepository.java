//capa controladora -> capa servicio: Interface -> capa servicio: Clase -> CAPA REPOSITORIO (aquí) -> BD

package com.primerapp.portfolio.repository;

import com.primerapp.portfolio.model.usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Long>{
    List<usuario> findByEmailAndHabilitadoTrue(String email);
}