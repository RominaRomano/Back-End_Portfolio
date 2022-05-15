package com.primerapp.portfolio.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter

@Entity
public class experiencia implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String puesto;
    private String empresa;
    @Column(name = "TAREA", length = 1000)
    private String tarea;
    private String contacto;
    private String fechini;
    private String fechfin;

    public experiencia() {
    }

    public experiencia(long id, String puesto, String empresa, String tarea, String contacto, String fechini, String fechfin) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.tarea = tarea;
        this.contacto = contacto;
        this.fechini = fechini;
        this.fechfin = fechfin;
    }
}