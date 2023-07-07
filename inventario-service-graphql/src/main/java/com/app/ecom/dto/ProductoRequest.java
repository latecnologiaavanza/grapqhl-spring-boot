package com.app.ecom.dto;

public record ProductoRequest(
        String id,
        String nombre,
        double precio,
        int cantidad,
        Long categoriaId
) {
}
