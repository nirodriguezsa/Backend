package com.unadopcion.unadopcion.modelo;

public class Usuario {

    private String nombre;
    private String contraseña;
    private String email;
    private String telefono;
    private int puntuacion;
    private String rol;
    private String direccion;
    private String reseña;



    private int id;

    
    public Usuario() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseñA() {
        return this.contraseña;
    }

    public void setContraseñA(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return this.rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReseñA() {
        return this.reseña;
    }

    public void setReseñA(String reseña) {
        this.reseña = reseña;
    }

}
