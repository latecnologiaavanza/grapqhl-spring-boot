package com.app.ecom.repository;

import com.app.ecom.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,String> {
}
