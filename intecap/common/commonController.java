package com.example.intecap.common;

import org.springframework.beans.factory.annotation.Autowired;

public class commonController <E,S extends commonSvc<E>> {
    
    @Autowired
    protected S service;
    
}
