package com.app.ecom.repository;

import com.app.ecom.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
