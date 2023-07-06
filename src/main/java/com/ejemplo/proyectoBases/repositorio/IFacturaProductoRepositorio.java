package com.ejemplo.proyectoBases.repositorio;

import com.ejemplo.proyectoBases.modelos.FacturaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaProductoRepositorio extends JpaRepository<FacturaProducto, Long> {
}
