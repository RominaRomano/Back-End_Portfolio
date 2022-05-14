package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.proyecto;
import com.primerapp.portfolio.repository.proyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proyectoService implements IproyectoService{
    @Autowired
    public proyectoRepository proyeRepo;

    @Override
    public proyecto crearProyecto(proyecto proye) {
        return proyeRepo.save(proye);
    }
    
    @Override
    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    @Override
    public void modificarProyecto(proyecto proye) {
        proyeRepo.save(proye);
    }

    @Override
    public proyecto buscarProyecto(Long id) {
        return proyeRepo.findById(id).orElse(null);
    }

    @Override
    public List<proyecto> verProyectos() {
        return proyeRepo.findAll();
    }
}
