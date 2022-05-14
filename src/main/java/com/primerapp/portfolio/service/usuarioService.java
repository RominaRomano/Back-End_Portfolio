//capa controladora -> capa servicio: Interface -> CAPA SERVICIO:CLASE (aquí) -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.usuario;
import com.primerapp.portfolio.model.dto.UserDto;
import com.primerapp.portfolio.repository.usuarioRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService implements IusuarioService{
    @Autowired
    public usuarioRepository usuaRepo;
    
    @Override
    public boolean isUserEnabled(UserDto userDto) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        List<usuario> usuarios = usuaRepo.findByEmailAndHabilitadoTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            usuario usuar = usuarios.get(0);
            return argon2.verify(usuar.getPassword(),userDto.getPassword());
        }
        else {
            return false; }
    }
    
    @Override
    public void crearUsuario(usuario usuar) throws Exception{
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1, 1024, 1, usuar.getPassword());
        List<usuario> usuarios = usuaRepo.findByEmailAndHabilitadoTrue(usuar.getEmail());
        if (!usuarios.isEmpty()) {
            throw new Exception("Ya existe ese Usuario.");
        } 
        else {
            usuar.setPassword(hash);
            usuar.setHabilitado(true);
            usuaRepo.save(usuar);
        }
    }
}