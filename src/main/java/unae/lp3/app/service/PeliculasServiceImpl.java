package unae.lp3.app.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import unae.lp3.app.model.Pelicula;

@Service
public class PeliculasServiceImpl implements IPeliculasService {

	private List<Pelicula> lista = null;

	public PeliculasServiceImpl() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

		lista = new LinkedList<Pelicula>();
		// try {

		Pelicula pelicula1 = new Pelicula();
		pelicula1.setId(1);
		pelicula1.setTitulo("Power Rangers");
		pelicula1.setDuracion(120);
		pelicula1.setClasificacion("B");
		pelicula1.setGenero("Aventura");
		pelicula1.setImagen("powranger.jpg");
		pelicula1.setFechaEstreno("02-05-2017");

		// Pelicula peli2 = new Pelicula(2, "El engendro", 105, "A", "Terror",
		// "engendro.jpg","30-07-2018");
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setId(2);
		pelicula2.setTitulo("El engendro");
		pelicula2.setDuracion(105);
		pelicula2.setClasificacion("A");
		pelicula2.setGenero("Terror");
		pelicula2.setImagen("engendro.jpg");
		pelicula2.setFechaEstreno("30-07-2018");

		// Pelicula peli3 = new Pelicula(3, "Ocean 11", 145, "A", "Accion",
		// "ocean11.jpg", "31-05-2018");
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setId(3);
		pelicula3.setTitulo("Ocean 11");
		pelicula3.setDuracion(145);
		pelicula3.setClasificacion("A");
		pelicula3.setGenero("Accion");
		pelicula3.setImagen("ocean11.jpg");
		pelicula3.setFechaEstreno("31-05-2018");

		// Pelicula peli4 = new Pelicula(4, "Indiana Jones VI", 125, "A", "Aventura",
		// "indiana5.jpg",formatter.parse("06-06-2017"));
		Pelicula pelicula4 = new Pelicula();
		pelicula4.setId(3);
		pelicula4.setTitulo("Indiana Jones VI");
		pelicula4.setDuracion(145);
		pelicula4.setClasificacion("A");
		pelicula4.setGenero("Aventura");
		pelicula4.setImagen("indiana5.jpg");
		pelicula4.setFechaEstreno("06-06-2017");
		lista.add(pelicula1);
		lista.add(pelicula2);
		lista.add(pelicula3);
		lista.add(pelicula4);

		/*
		 * } catch (ParseException e) { System.out.println("Error: " + e.getMessage());
		 * 
		 * }
		 */
	}

	public List<Pelicula> getPeliculas() {
		// TODO Auto-generated method stub
		return lista;
	}

	public Pelicula getPelicula(int peliId) {
		// TODO Auto-generated method stub
		for (Pelicula i : lista) {
			if (i.getId() == peliId) {
				return i;
			}
		}

		return null;
	}

	public Pelicula savePelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Pelicula pelicula) {
		// TODO Auto-generated method stub
		lista.add(pelicula);
	}

}
