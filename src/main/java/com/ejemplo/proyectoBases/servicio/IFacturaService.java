package com.ejemplo.proyectoBases.servicio;

import com.ejemplo.proyectoBases.modelos.Factura;

import java.util.List;
import java.util.Optional;

public interface IFacturaService {

    Factura crearFactura(Factura factura);

    Factura actualizarFactura(Factura factura);

    void eliminarFactura(Factura factura);

    Optional<Factura> obtenerFactura(Long id);

    List<Factura> obtenerFacturas();

}
