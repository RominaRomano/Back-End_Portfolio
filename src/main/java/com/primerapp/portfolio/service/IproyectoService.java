//capa controladora -> CAPA SERVICIO: INTERFACE (aquí) -> capa servicio: Clase -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.proyecto;
import java.util.List;

public interface IproyectoService {
   
    public proyecto crearProyecto (proyecto proye);
    public void borrarProyecto (Long id);
    public void modificarProyecto (proyecto proye);
    public proyecto buscarProyecto (Long id);
    public List<proyecto> verProyectos();
}