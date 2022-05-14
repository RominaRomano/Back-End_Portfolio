//capa controladora -> CAPA SERVICIO: INTERFACE (aquí) -> capa servicio: Clase -> capa repositorio -> BD

package com.primerapp.portfolio.service;

import com.primerapp.portfolio.model.educacion;
import java.util.List;

public interface IeducacionService {
   
    public educacion crearEducacion (educacion educa);
    public void borrarEducacion (Long id);
    public void modificarEducacion (educacion educa);
    public educacion buscarEducacion (Long id);
    public List<educacion> verEducaciones();
}
