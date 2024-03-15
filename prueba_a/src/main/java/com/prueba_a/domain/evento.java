
package com.prueba_a.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity               
@Table(name = "evento")

public class evento implements Serializable {
    
    private static final long serialVersionUID = 1L; 

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name = "id_evento") 
    private long idEvento;    
    private String descripcion;
    private String rutaImagen;
    

    public evento() {
    }

    public evento(String descripcion) {
        this.descripcion = descripcion;
    }
}
