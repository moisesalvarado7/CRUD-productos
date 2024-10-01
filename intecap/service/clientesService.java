package com.example.intecap.service;

import java.util.Optional;

import com.example.intecap.common.commonSvc;
import com.example.intecap.models.clientesModel;

public interface clientesService extends commonSvc<clientesModel> {

    public Iterable<clientesModel> findAll();

    public Optional<clientesModel> findById(int id);

    public clientesModel findByNombre(String nombre);

    public clientesModel save(clientesModel entity);
    
    public void deleteById(int id);
    
    Iterable<clientesModel> saveAll(Iterable<clientesModel> entities);

}
