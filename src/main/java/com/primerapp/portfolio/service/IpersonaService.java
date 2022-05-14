package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.persona;
import java.util.List;

public interface IpersonaService {
   
    public void crearPersona (persona pers);
    public void borrarPersona (Long id);
    public void modificarPersona (persona per);
    public persona buscarPersona (Long id);
    public List<persona> verPersonas();
}
