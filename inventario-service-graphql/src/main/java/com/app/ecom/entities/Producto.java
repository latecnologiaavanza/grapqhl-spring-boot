package com.app.ecom.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Producto {

    @Id
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;

    @ManyToOne
    private Categoria categoria;
}
