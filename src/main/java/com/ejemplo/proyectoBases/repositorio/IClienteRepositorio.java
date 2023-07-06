package com.ejemplo.proyectoBases.repositorio;

import com.ejemplo.proyectoBases.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepositorio extends JpaRepository<Cliente, Long> {
}
