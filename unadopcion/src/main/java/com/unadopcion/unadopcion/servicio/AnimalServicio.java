package com.unadopcion.unadopcion.servicio;

import com.unadopcion.unadopcion.modelo.Animal;
import com.unadopcion.unadopcion.repositorio.AnimalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AnimalServicio {
    @Autowired
    private AnimalRepositorio animalRepositorio;

    @Transactional
    public Animal crearAnimal(String animalNombre, String animalTipo,
                              String animalLugar, String animalDescripcion,
                              String animalSexo, int animalEdad, int registroId){

        Animal animal = new Animal();
        animal.setRegistroId(registroId);
        animal.setAnimalNombre(animalNombre);
        animal.setAnimalTipo(animalTipo);
        animal.setAnimalLugar(animalLugar);
        animal.setAnimalDescripcion(animalDescripcion);
        animal.setAnimalSexo(animalSexo);
        animal.setAnimalEdad(animalEdad);
        return animalRepositorio.save(animal);
    }


    public Optional buscarAnimalById(int id){
        return Optional.ofNullable(animalRepositorio.findById(id));
    }

    public Optional buscarAnimalByTipo(String tipo){
        return null;//return Optional.ofNullable(animalRepositorio.buscarAnimalByAnimalTipo(tipo));

    }


}
