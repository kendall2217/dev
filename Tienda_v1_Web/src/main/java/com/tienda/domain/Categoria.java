
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity               /*Usted tiene una data y una entidad que se llama categoria, es la tabla "categoria" en el workbench*/
@Table(name = "categoria")

public class Categoria implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoria.

    @Id //id categoria es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_categoria") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idCategoria;    /*se utiliza un long para tener un espacio mas grande en el disco, para poder guardar mas informacion de las id, porque el int tiene un limite.*/
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    //Asociacion con la tabla de productos
    @OneToMany   // de categorias a productos es una relacion de unop a muchos 
    @JoinColumn(name="id_categoria", updatable=false) //esta es la union con la tabla de productos(foreing key)
    List<Producto> productos; // Lista de productos
    
    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}