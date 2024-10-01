package com.example.intecap.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.intecap.models.clientesModel;
import com.example.intecap.service.clientesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@RestController
@RequestMapping("/clientes") //Todo lo que este dentro del contralador debe tener clienets
public class clientesController {
    
    @Autowired
    private clientesService clienteService;

    @GetMapping("/listar")
    public Iterable<clientesModel> getClientes() {
        return this.clienteService.findAll();
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> saveClientes(@RequestBody clientesModel entity) {
        try {
            this.clienteService.save(entity);
            return ResponseEntity.ok("Cliente se guardo correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }
    }

    @GetMapping("/eliminar")
    public ResponseEntity<String> deleteClientes(@PathVariable int idCliente) {
        try {
            this.clienteService.deleteById(idCliente);
            return ResponseEntity.ok("Cliente eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error en el servidor");
        }
    }
    
    
    
}
