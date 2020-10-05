package com.unadopcion.unadopcion.controladores;

import com.unadopcion.unadopcion.modelo.RegistroMascota;
import com.unadopcion.unadopcion.modelo.Animal;
import com.unadopcion.unadopcion.servicio.AnimalServicio;
import com.unadopcion.unadopcion.servicio.RegistroMascotaServicio;
import com.unadopcion.unadopcion.servicio.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrarMascotaControlador {

    @Autowired
    private RegistroMascotaServicio registroServicio;
    @Autowired
    private AnimalServicio animalServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;
    private Integer registroId;

    @RequestMapping("/registrarmascota")
    public String registrarMascota(@RequestParam int idusuario, @RequestParam String fecha, String animalNombre,
            String animalTipo, String animalLugar, String animalDescripcion, String animalSexo, int animalEdad) {
        // Verifica si el usuario
        if (usuarioServicio.existeUsuario(idusuario)) {

            RegistroMascota registro = registroServicio.registrar(idusuario, fecha);
            registroId = registro.getRegistroId();
            Animal mascota = animalServicio.crearAnimal(animalNombre, animalTipo, animalLugar, animalDescripcion,
                    animalSexo, animalEdad, registroId);
            return "ID de la mascota: " + mascota.getAnimalId() + "Asociada al usuario: " + idusuario;
        } else {
            return "El usuario " + idusuario + " no existe. ";
        }

    }
}