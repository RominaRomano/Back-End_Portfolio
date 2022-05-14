package com.primerapp.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter

@Entity
public class habilidad implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String icono;
    private String nombre;
    private String porcentaje;

    public habilidad() {
    }

    public habilidad(long id, String icono, String nombre, String porcentaje) {
        this.id = id;
        this.icono = icono;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
}    