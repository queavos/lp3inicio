package unae.lp3.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.app.model.Pelicula;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}

	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public String goPeliculas(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> peliculas = getLista();
		model.addAttribute("peliculas", peliculas);
		return "pelis";
	}

	private List<Pelicula> getLista() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		lista = new LinkedList<>();
		try {
			Pelicula peli1 = new Pelicula(1, "Power Rangers", 105, "A", "Accion", "powranger.jpg","09-06-2018");
			Pelicula peli2 = new Pelicula(2, "El engendro", 105, "A", "Terror", "engendro.jpg","30-07-2018");
			Pelicula peli3 = new Pelicula(3, "Ocean 11", 145, "A", "Accion", "ocean11.jpg", "31-05-2018");
			Pelicula peli4 = new Pelicula(4, "Indiana Jones VI", 125, "A", "Aventura", "indiana5.jpg",formatter.parse("06-06-2017"));
			lista.add(peli1);
			lista.add(peli3);
			lista.add(peli2);
			lista.add(peli4);
			return lista;
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}

	}
}