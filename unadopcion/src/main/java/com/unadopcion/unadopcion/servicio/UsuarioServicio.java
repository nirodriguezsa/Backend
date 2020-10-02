package com.unadopcion.unadopcion.servicio;

import com.unadopcion.unadopcion.modelo.Usuario;
import com.unadopcion.unadopcion.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public Usuario crearUsuario(int logeo_id, String usuario_nombre, String usuario_telefono){
         String ninguno = "ninguno";
         Usuario usuario = new Usuario();
         usuario.setLogeo_id(logeo_id);
         usuario.setUsuario_nombre(usuario_nombre);
         usuario.setUsuario_telefono(usuario_telefono);
         usuario.setUsuario_rol(ninguno);
         usuario.setUsuario_puntos(0);
         usuario.setUsuario_email(ninguno);
         usuario.setUsuario_lugar(ninguno);
         usuario.setUsuario_info(ninguno);
         return usuarioRepositorio.save(usuario);

    }

    public Optional<Usuario> buscarUsuario(int id)
    {
        return usuarioRepositorio.findById(id);
    }
}

