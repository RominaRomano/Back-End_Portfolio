package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.persona;
import com.primerapp.portfolio.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IpersonaService{
    @Autowired
    public personaRepository persoRepo;

    @Override
    public void crearPersona(persona pers) {
        persoRepo.save(pers);
    }
    
    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void modificarPersona(persona per) {
        persoRepo.save(per);
    }

    @Override
    public persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public List<persona> verPersonas() {
        return persoRepo.findAll();
    }
}
