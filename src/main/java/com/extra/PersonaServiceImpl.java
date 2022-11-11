package com.extra;

import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Component("archivo_extra")
public class PersonaServiceImpl implements IPersonaService {
    Logger logger = Logger.getLogger(PersonaServiceImpl.class.getName());
    @Override
    public void registrar(String nombre) {
        logger.info("..... "+nombre+" ......");
    }
}
