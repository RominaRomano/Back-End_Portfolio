//capa controladora -> CAPA SERVICIO: INTERFACE (aquí) -> capa servicio: Clase -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.habilidad;
import java.util.List;

public interface IhabilidadService {
   
    public habilidad crearHabilidad (habilidad habil);
    public void borrarHabilidad (Long id);
    public void modificarHabilidad (habilidad habil);
    public habilidad buscarHabilidad (Long id);
    public List<habilidad> verHabilidades();
}