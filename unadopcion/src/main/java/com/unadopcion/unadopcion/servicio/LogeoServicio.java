package com.unadopcion.unadopcion.servicio;

import com.unadopcion.unadopcion.modelo.Logeo;
import com.unadopcion.unadopcion.repositorio.LogeoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class LogeoServicio {

    @Autowired
    private LogeoRepositorio logeoRepositorio;

    @Transactional
    public Logeo crearLogeo(String nombre, String contrasena){

        Logeo logeo = new Logeo();
        logeo.setLogeoNombre(nombre);
        logeo.setLogeoContra(contrasena);
        return logeoRepositorio.save(logeo);

    }

    public boolean existsByNombre(String nombre)
    {
        return logeoRepositorio.existsByLogeoNombre(nombre);
    }


}
