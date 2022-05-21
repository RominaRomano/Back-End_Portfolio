package com.primerapp.portfolio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Basic;
import javax.persistence.Column;
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
    @Column(name = "DESCRIPCION", length = 1000)
    private String descripcion;
    private String rutafrontend;
    private String rutabackend;
    private String fechini;
    private String fechfin;

    public proyecto() {
    }

    public proyecto(long id, String nombre, String imagen, String descripcion, String rutafrontend, String rutabackend, String fechini, String fechfin) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.rutafrontend = rutafrontend;
        this.rutabackend = rutabackend;
        this.fechini = fechini;
        this.fechfin = fechfin;
    }
}