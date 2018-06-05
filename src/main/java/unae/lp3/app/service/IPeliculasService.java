package unae.lp3.app.service;

import java.util.List;

import unae.lp3.app.model.Pelicula;

public interface IPeliculasService {
	
	public List<Pelicula> getPeliculas();
	public Pelicula getPelicula(int peliId);
	public Pelicula savePelicula(Pelicula pelicula);
	public void insert(Pelicula pelicula);
	public void delete(int peliId);
	public void update(Pelicula pelicula);
}
