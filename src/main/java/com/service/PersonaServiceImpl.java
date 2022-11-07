package com.service;

import com.repository.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan({"com.repository"})// Revisa los modulos(paquetes) externos a este.
public class PersonaServiceImpl implements IPersonaService {


    @Autowired
    private IPersonaRepo repository;
    @Override
    public void registrar(String nombre) {
//        repository = new PersonaRepoImpl();//Usando la anotacion @Autowired ya no es necesario la instancia
        repository.registrar(nombre);
    }
}
