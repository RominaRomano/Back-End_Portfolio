package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.experiencia;
import com.primerapp.portfolio.repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienciaService implements IexperienciaService{
    @Autowired
    public experienciaRepository experRepo;

    @Override
    public experiencia crearExperiencia(experiencia exper) {
        return experRepo.save(exper);
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        experRepo.deleteById(id);
    }

    @Override
    public void modificarExperiencia(experiencia exper) {
        experRepo.save(exper);
    }

    @Override
    public experiencia buscarExperiencia(Long id) {
        return experRepo.findById(id).orElse(null);
    }

    @Override
    public List<experiencia> verExperiencias() {
        return experRepo.findAll();
    }
}
