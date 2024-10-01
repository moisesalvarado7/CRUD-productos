package com.example.intecap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intecap.models.clientesModel;
import com.example.intecap.models.productosModel;
import com.example.intecap.service.clientesService;
import com.example.intecap.service.productosService;

@RestController
@RequestMapping("/productos")
public class productosController {
        
    @Autowired
    private productosService productosService;

    @PostMapping("/guardar")
    public ResponseEntity<String> saveProductos(@RequestBody productosModel entity) {

        try {
            this.productosService.save(entity);
            return ResponseEntity.ok("Producto guardado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar el producto");
        }
    }

    @GetMapping("/eliminar")
    public ResponseEntity<String> deleteProductos(@PathVariable int idProducto) {
        try {
            this.productosService.deleteById(idProducto);
            return ResponseEntity.ok("Producto eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }
    }

    @PutMapping("/listar")
    public ResponseEntity<String> updateProductos(@RequestBody productosModel entity) {
        try {
            this.productosService.save(entity);
            return ResponseEntity.ok("Producto actualizado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }
    }
}
