package com.unadopcion.unadopcion.servicio;

import com.unadopcion.unadopcion.modelo.Logeo;
import com.unadopcion.unadopcion.repositorio.LogeoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> restaurado

import javax.transaction.Transactional;

@Service
public class LogeoServicio {

    @Autowired
    private LogeoRepositorio logeoRepositorio;

    @Transactional
    public Logeo crearLogeo(String nombre, String contrasena){

        Logeo logeo = new Logeo();
<<<<<<< HEAD
        logeo.setLogeoNombre(nombre);
        logeo.setLogeoContra(contrasena);
=======
        logeo.setLogeo_nombre(nombre);
        logeo.setLogeo_contrasena(contrasena);
>>>>>>> restaurado
        return logeoRepositorio.save(logeo);

    }

<<<<<<< HEAD
    public boolean existsByNombre(String nombre)
    {
        return logeoRepositorio.existsByLogeoNombre(nombre);
    }

=======
>>>>>>> restaurado

}
