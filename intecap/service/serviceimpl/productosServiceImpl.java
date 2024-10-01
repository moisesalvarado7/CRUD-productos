package com.example.intecap.service.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.intecap.common.commonSvcImpl;
import com.example.intecap.models.productosModel;
import com.example.intecap.service.productosService;
import com.example.intecap.repository.productosRepository;

@Service
public class productosServiceImpl extends commonSvcImpl<productosModel, productosRepository> implements productosService {

    @Autowired
    private productosRepository productosRepository;

    @Override
    public Iterable<productosModel> findAll() {
        return this.productosRepository.findAll();
    }

    @Override
    public Optional<productosModel> findById(int id) {
        return this.productosRepository.findById(id);
    }

    @Override
    public productosModel findByNombre(String nombre) {
        return this.productosRepository.findByNombre(nombre);
    }

    @Override
    public productosModel save(productosModel entity) {
        return this.productosRepository.save(entity);
    }

    @Override
    public void deleteById(int id) {
        this.productosRepository.deleteById(id);
    }

    @Override
    public Iterable<productosModel> saveAll(Iterable<productosModel> entities) {
        return this.productosRepository.saveAll(entities);
    }   
    
}
