package com.unadopcion.unadopcion.modelo;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuario_id;
    private int logeo_id;
    private String usuario_nombre;
    private String usuario_rol;
    private double usuario_puntos;
    private String usuario_email;
    private String usuario_telefono;
    private String usuario_lugar;
    private String usuario_info;



    public Usuario() {}

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLogeo_id() {
        return logeo_id;
    }

    public void setLogeo_id(int logeo_id) {
        this.logeo_id = logeo_id;
    }

    public String getUsuario_nombre() {
        return usuario_nombre;
    }

    public void setUsuario_nombre(String usuario_nombre) {
        this.usuario_nombre = usuario_nombre;
    }

    public String getUsuario_rol() {
        return usuario_rol;
    }

    public void setUsuario_rol(String usuario_rol) {
        this.usuario_rol = usuario_rol;
    }

    public double getUsuario_puntos() {
        return usuario_puntos;
    }

    public void setUsuario_puntos(double usuario_puntos) {
        this.usuario_puntos = usuario_puntos;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_telefono() {
        return usuario_telefono;
    }

    public void setUsuario_telefono(String usuario_telefono) {
        this.usuario_telefono = usuario_telefono;
    }

    public String getUsuario_lugar() {
        return usuario_lugar;
    }

    public void setUsuario_lugar(String usuario_lugar) {
        this.usuario_lugar = usuario_lugar;
    }

    public String getUsuario_info() {
        return usuario_info;
    }

    public void setUsuario_info(String usuario_info) {
        this.usuario_info = usuario_info;
    }
}
