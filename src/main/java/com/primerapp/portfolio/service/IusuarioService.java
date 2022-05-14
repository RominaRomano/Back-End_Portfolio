//capa controladora -> CAPA SERVICIO: INTERFACE (aquí) -> capa servicio: Clase -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.dto.UserDto;
import com.primerapp.portfolio.model.usuario;

public interface IusuarioService {
    
    public boolean isUserEnabled(UserDto userDto);
    public void crearUsuario(usuario usuar) throws Exception;
}