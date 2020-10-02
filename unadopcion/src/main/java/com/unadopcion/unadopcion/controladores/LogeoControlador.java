package com.unadopcion.unadopcion.controladores;

import com.unadopcion.unadopcion.modelo.Logeo;

import com.unadopcion.unadopcion.modelo.Usuario;
import com.unadopcion.unadopcion.servicio.LogeoServicio;
import com.unadopcion.unadopcion.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class LogeoControlador {


    @Autowired
    private LogeoServicio logeoServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;
    private Integer logeo_id;

    @RequestMapping("/crearusuario")
    public String crearNuevoUsuario(@RequestParam String nombre, String contrasena, String telefono){
         //crea registro logeo primero
         if(true) //TODO: verificar que usuario no este repetido
         {
             Logeo logeo = logeoServicio.crearLogeo(nombre, contrasena);
             logeo_id = logeo.getLogeo_id();
             //crear usuario con el id del logeo
             Usuario usuario = usuarioServicio.crearUsuario(logeo_id,  nombre, telefono);
             return "ID nuevo usuario: " + usuario.getUsuario_id();
         }else{

             return "El nombre de usuario ya existe";
         }



    }

    @GetMapping("/buscausuario/{id}")
    public Optional<Usuario> buscarUsuario(@PathVariable Integer id){

        return usuarioServicio.buscarUsuario(id);
    }

    @GetMapping("/listar")
    public Iterable<Logeo> getLogeos(){
       return null;
    }
}
