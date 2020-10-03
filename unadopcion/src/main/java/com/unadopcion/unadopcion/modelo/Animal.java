package com.unadopcion.unadopcion.modelo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Animal {
    @Id
    private int animalId;
    private int animalEdad;
    private int adopcionId;
    private int registroId;
    String animalNombre;
    String animalTipo;
    String animalLugar;
    String animalDescripcion;
    String animalSexo;

    public Animal(){}

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public int getAnimalEdad() {
        return animalEdad;
    }

    public void setAnimalEdad(int animalEdad) {
        this.animalEdad = animalEdad;
    }

    public int getAdopcionId() {
        return adopcionId;
    }

    public void setAdopcionId(int adopcionId) {
        this.adopcionId = adopcionId;
    }

    public int getRegistroId() {
        return registroId;
    }

    public void setRegistroId(int registroId) {
        this.registroId = registroId;
    }

    public String getAnimalNombre() {
        return animalNombre;
    }

    public void setAnimalNombre(String animalNombre) {
        this.animalNombre = animalNombre;
    }

    public String getAnimalTipo() {
        return animalTipo;
    }

    public void setAnimalTipo(String animalTipo) {
        this.animalTipo = animalTipo;
    }

    public String getAnimalLugar() {
        return animalLugar;
    }

    public void setAnimalLugar(String animalLugar) {
        this.animalLugar = animalLugar;
    }

    public String getAnimalDescripcion() {
        return animalDescripcion;
    }

    public void setAnimalDescripcion(String animalDescripcion) {
        this.animalDescripcion = animalDescripcion;
    }

    public String getAnimalSexo() {
        return animalSexo;
    }

    public void setAnimalSexo(String animalSexo) {
        this.animalSexo = animalSexo;
    }
}
