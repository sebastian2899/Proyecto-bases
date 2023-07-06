package com.ejemplo.proyectoBases.servicio.impl;

import com.ejemplo.proyectoBases.modelos.Factura;
import com.ejemplo.proyectoBases.repositorio.IFacturaProductoRepositorio;
import com.ejemplo.proyectoBases.repositorio.IFacturaRepositorio;
import com.ejemplo.proyectoBases.servicio.IFacturaService;
import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Transactional
@RequiredArgsConstructor
public class FacturaServiceImpl implements IFacturaService {

    private static final Random RANDOM = new Random();
    private final IFacturaRepositorio facturaRepositorio;

    private final IFacturaProductoRepositorio facturaProductoRepositorio;

    @Override
    public Factura crearFactura(Factura factura) {
         factura.setTotalFactura(factura.getTotal());
         factura.setNumero(String.valueOf(RANDOM.nextInt(1000000)));
         factura.setFechaCreacion(LocalDate.now());

         Factura facturaResp = facturaRepositorio.save(factura);

         factura.getProductos().forEach(facturaProducto -> {
             facturaProducto.setFactura(facturaResp);
                facturaProductoRepositorio.save(facturaProducto);
         });

          return facturaResp;
    }
    @Override
    public Factura actualizarFactura(Factura factura) {
        return null;
    }

    @Override
    public void eliminarFactura(Factura factura) {

    }

    @Override
    public Optional<Factura> obtenerFactura(Long id) {
        return facturaRepositorio.findById(id);
    }

    @Override
    public List<Factura> obtenerFacturas() {
        return facturaRepositorio.findAll();
    }


}
