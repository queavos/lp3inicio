package unae.lp3.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import unae.lp3.app.model.Pelicula;
import unae.lp3.app.service.IPeliculasService;
//@RequestMapping(value="/")
@Controller
public class HomeController {
	
	@Autowired
	private IPeliculasService servicePeliculas;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}

	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public String goPeliculas(Model model) {
		List<Pelicula> peliculas = servicePeliculas.getPeliculas();
		model.addAttribute("peliculas", peliculas);
		return "peliculas/index";
	}
	@RequestMapping(value = "/pelicula/{id}", method = RequestMethod.GET)
	public String goPelicula(Model model, @PathVariable("id") int idPeli ) {
		Pelicula pelicula = servicePeliculas.getPelicula(idPeli);
		model.addAttribute("pelicula", pelicula);
		return "peliculas/show";
	}
	@RequestMapping(value = "/pelicula/new", method = RequestMethod.GET)
	public String goNewPeli( @ModelAttribute Pelicula pelicula )
	{
		return "peliculas/new.form";
	}
	@PostMapping(value="/pelicula/save")
	public String goSavePeli( Pelicula pelicula, Model model )
	{	
		System.out.println(pelicula.getTitulo());
		servicePeliculas.insert(pelicula);
		List<Pelicula> peliculas = servicePeliculas.getPeliculas();
		model.addAttribute("peliculas", peliculas);
		return "peliculas/index";
	}
/*private List<Pelicula> getLista() {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		//lista = new LinkedList<Pelicula>();
		try {
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Rangers");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setImagen("powranger.jpg");
			pelicula1.setFechaEstreno("02-05-2017");

			//Pelicula peli2 = new Pelicula(2, "El engendro", 105, "A", "Terror", "engendro.jpg","30-07-2018");
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("El engendro");
			pelicula2.setDuracion(105);
			pelicula2.setClasificacion("A");
			pelicula2.setGenero("Terror");
			pelicula2.setImagen("engendro.jpg");
			pelicula2.setFechaEstreno("30-07-2018");
			
			//Pelicula peli3 = new Pelicula(3, "Ocean 11", 145, "A", "Accion", "ocean11.jpg", "31-05-2018");
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(3);
			pelicula3.setTitulo("Ocean 11");
			pelicula3.setDuracion(145);
			pelicula3.setClasificacion("A");
			pelicula3.setGenero("Accion");
			pelicula3.setImagen("ocean11.jpg");
			pelicula3.setFechaEstreno("31-05-2018");
			
			//Pelicula peli4 = new Pelicula(4, "Indiana Jones VI", 125, "A", "Aventura", "indiana5.jpg",formatter.parse("06-06-2017"));
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
			return lista;
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}

	}*/
}