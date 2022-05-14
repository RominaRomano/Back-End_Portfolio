package com.primerapp.portfolio.controller;

// Importaciones para Persona
import com.primerapp.portfolio.model.persona;
import com.primerapp.portfolio.service.IpersonaService;

// Importaciones para Experiencia
import com.primerapp.portfolio.model.experiencia;
import com.primerapp.portfolio.service.IexperienciaService;

// Importaciones para Educación
import com.primerapp.portfolio.model.educacion;
import com.primerapp.portfolio.service.IeducacionService;

// Importaciones para Habilidad
import com.primerapp.portfolio.model.habilidad;
import com.primerapp.portfolio.service.IhabilidadService;

// Importaciones para Proyecto
import com.primerapp.portfolio.model.proyecto;
import com.primerapp.portfolio.service.IproyectoService;

// Importaciones para Usuario
import com.primerapp.portfolio.model.dto.UserDto;
import com.primerapp.portfolio.model.usuario;
import com.primerapp.portfolio.service.IusuarioService;

// Importaciones Generales
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"http://localhost:4200"})

public class controller {

// Controladora de PERSONA (Alta, Baja, Modificación, Consulta Individual, Consulta Gral.)

    @Autowired
    private IpersonaService persoServ;
 
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody persona pers){
        persoServ.crearPersona(pers);
    }
    
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("/modificar/persona")
    public void modificarPersona(@RequestBody persona pers){
        persoServ.modificarPersona(pers);
    }
    
    @GetMapping ("/buscar/persona/{id}")
    @ResponseBody
    public persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
 
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
// Controladora de EXPERIENCIA (Alta, Baja, Modificación, Consulta Individual, Consulta Gral.)

    @Autowired
    private IexperienciaService experServ;
 
    @PostMapping("/new/experiencia")
    public experiencia agregarExperiencia(@RequestBody experiencia exper){
        return experServ.crearExperiencia(exper);
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experServ.borrarExperiencia(id);
    }
    
    @PutMapping ("/modificar/experiencia")
    public void modificarExperiencia(@RequestBody experiencia exper){
        experServ.modificarExperiencia(exper);
    }
    
    @GetMapping ("/buscar/experiencia/{id}")
    @ResponseBody
    public experiencia buscarExperiencia(@PathVariable Long id){
        return experServ.buscarExperiencia(id);
    }
 
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<experiencia> verExperiencias(){
        return experServ.verExperiencias();
    }

// Controladora de EDUCACIÓN (Alta, Baja, Modificación, Consulta Individual, Consulta Gral.)

    @Autowired
    private IeducacionService educaServ;
 
    @PostMapping("/new/educacion")
    public educacion agregarEducacion(@RequestBody educacion educa){
        return educaServ.crearEducacion(educa);
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educaServ.borrarEducacion(id);
    }
    
    @PutMapping ("/modificar/educacion")
    public void modificarEducacion(@RequestBody educacion educa){
        educaServ.modificarEducacion(educa);
    }
    
    @GetMapping ("/buscar/educacion/{id}")
    @ResponseBody
    public educacion buscarEducacion(@PathVariable Long id){
        return educaServ.buscarEducacion(id);
    }
 
    @GetMapping ("/ver/educaciones")
    @ResponseBody
    public List<educacion> verEducaciones(){
        return educaServ.verEducaciones();
    }

// Controladora de HABILIDAD (Alta, Baja, Modificación, Consulta Individual, Consulta Gral.)

    @Autowired
    private IhabilidadService habilServ;
 
    @PostMapping("/new/habilidad")
    public habilidad agregarHabilidad(@RequestBody habilidad habil){
        return habilServ.crearHabilidad(habil);
    }
    
    @DeleteMapping("/delete/habilidad/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilServ.borrarHabilidad(id);
    }
    
    @PutMapping ("/modificar/habilidad")
    public void modificarHabilidad(@RequestBody habilidad habil){
        habilServ.modificarHabilidad(habil);
    }
    
    @GetMapping ("/buscar/habilidad/{id}")
    @ResponseBody
    public habilidad buscarHabilidad(@PathVariable Long id){
        return habilServ.buscarHabilidad(id);
    }
 
    @GetMapping ("/ver/habilidades")
    @ResponseBody
    public List<habilidad> verHabilidades(){
        return habilServ.verHabilidades();
    }

    // Controladora de PROYECTOS (Alta, Baja, Modificación, Consulta Individual, Consulta Gral.)

    @Autowired
    private IproyectoService proyeServ;
 
    @PostMapping("/new/proyecto")
    public proyecto agregarProyecto(@RequestBody proyecto proye){
        return proyeServ.crearProyecto(proye);
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyeServ.borrarProyecto(id);
    }
    
    @PutMapping ("/modificar/proyecto")
    public void modificarProyecto(@RequestBody proyecto proye){
        proyeServ.modificarProyecto(proye);
    }
    
    @GetMapping ("/buscar/proyecto/{id}")
    @ResponseBody
    public proyecto buscarProyecto(@PathVariable Long id){
        return proyeServ.buscarProyecto(id);
    }
 
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<proyecto> verProyectos(){
        return proyeServ.verProyectos();
    }

    // Controladora de USUARIO (Inicio de Sesion y Registro)
    @Autowired
    private IusuarioService usuarServ;
    
    @PostMapping("/iniciar-sesion")
    public boolean login(@RequestBody UserDto userDto) {
        return usuarServ.isUserEnabled(userDto);
    }
    
    @PostMapping("/registrese")
    public void register(@RequestBody usuario usuar) throws Exception {
        usuarServ.crearUsuario(usuar);
    }

// Asi me saludaba mi papá, era analista de sistemas, con este saludo en Postman supe que funcionó
    @GetMapping ("/saludo")
    public String saludar(){
        return "Hola Piba";
    }    
}