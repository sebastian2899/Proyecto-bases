package com.ejemplo.proyectoBases.repositorio;

import com.ejemplo.proyectoBases.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepositorio extends JpaRepository<Producto, Long> {
}
