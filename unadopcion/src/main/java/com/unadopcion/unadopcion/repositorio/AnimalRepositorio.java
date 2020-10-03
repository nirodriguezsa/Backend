package com.unadopcion.unadopcion.repositorio;
import com.unadopcion.unadopcion.modelo.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepositorio extends CrudRepository<Animal, Integer> {

    //Animal buscarAnimalByAnimalTipo(String tipo);
}
