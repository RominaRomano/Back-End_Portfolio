package com.primerapp.portfolio.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Basic;

@Getter 
@Setter

@Entity
public class usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Basic
    private String email;
    private String password;
    private boolean habilitado;

    public usuario() {
    }

    public usuario(Long id, String email, String password, boolean habilitado) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.habilitado = habilitado;
    }
    
}
