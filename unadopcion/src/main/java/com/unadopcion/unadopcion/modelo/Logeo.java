package com.unadopcion.unadopcion.modelo;

import javax.persistence.*;


@Entity
public class Logeo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logeo_id;
    private int usuario_id;
    private String logeo_nombre;
    private String logeo_contrasena;



    public Logeo() { }


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
    }
}
