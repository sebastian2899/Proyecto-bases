package com.ejemplo.proyectoBases.controlador;

import com.ejemplo.proyectoBases.modelos.Factura;
import com.ejemplo.proyectoBases.servicio.IFacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factura")
@RequiredArgsConstructor
public class FacturaController {

    private final IFacturaService facturaService;

    @PostMapping("/crear")
    public ResponseEntity<Factura> crearFactura(@RequestBody Factura factura) {
        return new ResponseEntity<>(facturaService.crearFactura(factura), HttpStatus.CREATED);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>> listarFacturas() {
        return new ResponseEntity<>(facturaService.obtenerFacturas(), HttpStatus.OK);
    }

    @GetMapping("/obtener_factura/{id}")
    public ResponseEntity<Optional<Factura>> obtenerFactura(@PathVariable  Long id) {
        return new ResponseEntity<>(facturaService.obtenerFactura(id), HttpStatus.OK);
    }

}
