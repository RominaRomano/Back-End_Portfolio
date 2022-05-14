package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.habilidad;
import com.primerapp.portfolio.repository.habilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class habilidadService implements IhabilidadService{
    @Autowired
    public habilidadRepository habilRepo;

    @Override
    public habilidad crearHabilidad(habilidad habil) {
        return habilRepo.save(habil);
    }
    
    @Override
    public void borrarHabilidad(Long id) {
        habilRepo.deleteById(id);
    }

    @Override
    public void modificarHabilidad(habilidad habil) {
        habilRepo.save(habil);
    }

    @Override
    public habilidad buscarHabilidad(Long id) {
        return habilRepo.findById(id).orElse(null);
    }

    @Override
    public List<habilidad> verHabilidades() {
        return habilRepo.findAll();
    }
}
