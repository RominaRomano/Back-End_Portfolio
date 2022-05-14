//capa controladora -> capa servicio: Interface -> CAPA SERVICIO:CLASE (aquí) -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.educacion;
import com.primerapp.portfolio.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class educacionService implements IeducacionService{
    @Autowired
    public educacionRepository educaRepo;

    @Override
    public educacion crearEducacion(educacion educa) {
        return educaRepo.save(educa);
    }
    
    @Override
    public void borrarEducacion(Long id) {
        educaRepo.deleteById(id);
    }

    @Override
    public void modificarEducacion(educacion educa) {
        educaRepo.save(educa);
    }

    @Override
    public educacion buscarEducacion(Long id) {
        return educaRepo.findById(id).orElse(null);
    }

    @Override
    public List<educacion> verEducaciones() {
        return educaRepo.findAll();
    }
}
