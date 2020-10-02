package com.unadopcion.unadopcion.servicio;

import com.unadopcion.unadopcion.modelo.Logeo;
import com.unadopcion.unadopcion.repositorio.LogeoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;

@Service
public class LogeoServicio {

    @Autowired
    private LogeoRepositorio logeoRepositorio;

    @Transactional
    public Logeo crearLogeo(String nombre, String contrasena){

        Logeo logeo = new Logeo();
        logeo.setLogeo_nombre(nombre);
        logeo.setLogeo_contrasena(contrasena);
        return logeoRepositorio.save(logeo);

    }


}
