package com.example.crud.service.impl;

import com.example.crud.bl.PersonaService;
import com.example.crud.commons.GenericServiceImp;
import com.example.crud.dao.PersonaDAO;
import com.example.crud.model.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl extends GenericServiceImp<Persona, Integer> implements PersonaService {

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    public CrudRepository<Persona, Integer> getDao() {   
        return personaDAO;
    }

    
}