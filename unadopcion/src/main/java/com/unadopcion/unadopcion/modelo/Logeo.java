package com.unadopcion.unadopcion.modelo;


import javax.persistence.*;


@Entity
public class Logeo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int logeoId;
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuarioId;
    private String logeoNombre;
    private String logeoContra;



    public Logeo() { }

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
    }
}
