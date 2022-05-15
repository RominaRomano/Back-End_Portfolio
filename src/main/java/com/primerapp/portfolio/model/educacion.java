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
public class educacion implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombre;
    private String logo;
    private String titulo;
    @Column(name = "DESCRIPCION", length = 1000)
    private String descripcion;
    private String fechini;
    private String fechfin;
    
    public educacion() {
    }
    
    public educacion(long id, String nombre, String logo, String titulo, String descripcion, String fechini, String fechfin) {
        this.id = id;
        this.nombre = nombre;
        this.logo = logo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechini = fechini;
        this.fechfin = fechfin;
    }
}