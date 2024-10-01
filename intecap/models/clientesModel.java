package com.example.intecap.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class clientesModel implements Serializable {

    @Id //Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autgoincrementable
    @Column(name="id") //Mapeo de la columna ID
    private int id;

    @Column(name="nombre") //Mapeo de la columna nombre
    private String nombre;

    @Column(name="apellido") //Mapeo de la columna apellido
    private String apellido;
}
