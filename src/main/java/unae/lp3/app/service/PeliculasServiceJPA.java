package unae.lp3.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unae.lp3.app.model.Pelicula;
import unae.lp3.app.repository.PeliculasRepository;
@Service
public class PeliculasServiceJPA implements IPeliculasService  {

	@Autowired
	public PeliculasRepository peliculasRepo;
	@Override
	public List<Pelicula> getPeliculas() {
		// TODO Auto-generated method stub
		return  (List<Pelicula>) peliculasRepo.findAll();
	}

	@Override
	public Pelicula getPelicula(int peliId) {
		// TODO Auto-generated method stub
		return peliculasRepo.findById(peliId).get();
	}

	@Override
	public Pelicula savePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Pelicula pelicula) {
		// TODO Auto-generated method stub
		peliculasRepo.save(pelicula);
	}

	@Override
	public void delete(int peliId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

}
