package com.unadopcion.unadopcion.modelo;

<<<<<<< HEAD

=======
>>>>>>> restaurado
import javax.persistence.*;


@Entity
public class Logeo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    private int logeoId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuarioId;
    private String logeoNombre;
    private String logeoContra;
=======
    private int logeo_id;
    private int usuario_id;
    private String logeo_nombre;
    private String logeo_contrasena;
>>>>>>> restaurado



    public Logeo() { }

<<<<<<< HEAD
    public int getLogeoId() {
        return logeoId;
    }

    public void setLogeoId(int logeoId) {
        this.logeoId = logeoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getLogeoNombre() {
        return logeoNombre;
    }

    public void setLogeoNombre(String logeoNombre) {
        this.logeoNombre = logeoNombre;
    }

    public String getLogeoContra() {
        return logeoContra;
    }

    public void setLogeoContra(String logeoContrasena) {
        this.logeoContra = logeoContrasena;
=======

    public int getLogeo_id() {
        return logeo_id;
    }

    public void setLogeo_id(int logeo_id) {
        this.logeo_id = logeo_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getLogeo_nombre() {
        return logeo_nombre;
    }

    public void setLogeo_nombre(String logeo_nombre) {
        this.logeo_nombre = logeo_nombre;
    }

    public String getLogeo_contrasena() {
        return logeo_contrasena;
    }

    public void setLogeo_contrasena(String logeo_contrasena) {
        this.logeo_contrasena = logeo_contrasena;
>>>>>>> restaurado
    }
}
