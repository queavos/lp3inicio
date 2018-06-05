package unae.lp3.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import unae.lp3.app.model.Pelicula;
@Repository
public interface PeliculasRepository extends CrudRepository <Pelicula, Integer> {

}
