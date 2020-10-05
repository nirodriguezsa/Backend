package com.unadopcion.unadopcion.repositorio;

import com.unadopcion.unadopcion.modelo.Adopcion;
import org.springframework.data.repository.CrudRepository;

public interface AdopcionRepositorio extends CrudRepository<Adopcion, Integer> {

    // boolean existsAdopcionAprobada(int animalId);
}
