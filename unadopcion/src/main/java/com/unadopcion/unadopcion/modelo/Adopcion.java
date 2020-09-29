package com.unadopcion.unadopcion.modelo;

public class Adopcion {

    private String fechaAdopcion;

    
    private int id;

    public Adopcion() {

    }

    public String getFechaAdopcion() {
        return this.fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}