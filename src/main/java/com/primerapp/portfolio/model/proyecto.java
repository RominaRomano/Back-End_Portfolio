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
public class proyecto implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    private String imagen;
    private String refboton;
    private String descripcion;
    private String fechini;
    private String fechfin;

    public proyecto() {
    }

    public proyecto(long id, String nombre, String imagen, String refboton, String descripcion, String fechini, String fechfin) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.refboton = refboton;
        this.descripcion = descripcion;
        this.fechini = fechini;
        this.fechfin = fechfin;
    }
}
