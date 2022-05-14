package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.experiencia;
import java.util.List;

public interface IexperienciaService {
   
    public experiencia crearExperiencia (experiencia exper);
    public void borrarExperiencia (Long id);
    public void modificarExperiencia (experiencia exper);
    public experiencia buscarExperiencia (Long id);
    public List<experiencia> verExperiencias();
}
