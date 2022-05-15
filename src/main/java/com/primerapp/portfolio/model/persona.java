package com.primerapp.portfolio.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Basic;
import javax.persistence.Column;


@Getter 
@Setter

@Entity
public class persona implements Serializable {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private String nombape;
    private String direccion;
    private String email;
    @Column(name = "ACERCADE", length = 1000)
    private String acercade;
    private String fechNac;
    private String dirPerfil;
    private String dirBanner;
    
    public persona() {}

    public persona(long id, String nombape, String direccion, String email, String acercade, String fechNac, String dirPerfil, String dirBanner) {
        this.id = id;
        this.nombape = nombape;
        this.direccion = direccion;
        this.email = email;
        this.acercade = acercade;
        this.fechNac = fechNac;
        this.dirPerfil = dirPerfil;
        this.dirBanner = dirBanner;
    }
}