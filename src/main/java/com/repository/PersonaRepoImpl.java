package com.repository;

import com.example.consola.ConsoleApplication;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

    org.slf4j.Logger logger = LoggerFactory.getLogger(ConsoleApplication.class);
    @Override
    public void registrar(String nombre) {
        logger.info("***** Se registro el nombre: "+ nombre + " , exitosamente *****");
    }
}
