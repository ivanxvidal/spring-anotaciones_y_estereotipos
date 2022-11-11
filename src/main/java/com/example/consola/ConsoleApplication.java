package com.example.consola;

import com.service.IPersonaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.service", "com.extra"})// Revisa los modulos(paquetes) externos a este.
public class ConsoleApplication implements CommandLineRunner {

    @Autowired
    private IPersonaService service;

    @Autowired
    @Qualifier("archivo_extra")
    private com.extra.IPersonaService service2;

    org.slf4j.Logger LOG = LoggerFactory.getLogger(ConsoleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Hola desde la ternimal :v");
        LOG.warn("Hola desde la ternimal >:)");
        //service = new PersonaServiceImpl(); //Usando la anotacion @Autowired ya no es necesario la instancia
        service.registrar("Juan Carlos Bodoque");
//        service2 = new PersonaServiceImpl();
        service2.registrar("Tulio Triviño");
    }

}
