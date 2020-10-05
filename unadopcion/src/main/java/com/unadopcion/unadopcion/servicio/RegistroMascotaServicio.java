package com.unadopcion.unadopcion.servicio;

import javax.transaction.Transactional;

import com.unadopcion.unadopcion.modelo.RegistroMascota;
import com.unadopcion.unadopcion.repositorio.RegistrarMascotaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroMascotaServicio {

    @Autowired
    private RegistrarMascotaRepositorio registrarMascotaRepositorio;

    @Transactional
    public RegistroMascota registrar(int idUsuario, String fecha) {

        RegistroMascota registro = new RegistroMascota();
        registro.setFechaRegistro(fecha);

        return registrarMascotaRepositorio.save(registro);

    }

}
