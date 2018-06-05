package unae.lp3.app.controller;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
import unae.lp3.app.repository.PeliculasRepository;
import unae.lp3.app.service.IPeliculasService;
//@RequestMapping(value="/")
@Controller
public class HomeController {
	
/*	@Autowired
	private IPeliculasService servicePeliculas;*/
	@Autowired
	public PeliculasRepository peliculasRepo; 
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goHome() {
		return "home";
	}

	@RequestMapping(value = "/peliculas", method = RequestMethod.GET)
	public String goPeliculas(Model model) {
		//List<Pelicula> peliculas = servicePeliculas.getPeliculas();
		List<Pelicula> peliculas = (List<Pelicula>) peliculasRepo.findAll();
		model.addAttribute("peliculas", peliculas);
		return "peliculas/index";
	}
	@RequestMapping(value = "/peliculas/{id}", method = RequestMethod.GET)
	public String goPelicula(Model model, @PathVariable("id") int idPeli ) {
		
		//Pelicula pelicula = servicePeliculas.getPelicula(idPeli);
		Pelicula pelicula = peliculasRepo.findById(idPeli).get();
		model.addAttribute("pelicula", pelicula);
		return "peliculas/show";
	}
	@RequestMapping(value = "/pelicula/new", method = RequestMethod.GET)
	public String goNewPeli( @ModelAttribute Pelicula pelicula )
	{
		return "peliculas/new.form";
	}
	@PostMapping(value="/peliculas/save")
	public String goSavePeli( Pelicula pelicula, Model model )
	{	
		System.out.println(pelicula.getTitulo());
		//servicePeliculas.insert(pelicula);
		peliculasRepo.save(pelicula);
		//List<Pelicula> peliculas = servicePeliculas.getPeliculas();
		List<Pelicula> peliculas = (List<Pelicula>) peliculasRepo.findAll();
		model.addAttribute("peliculas", peliculas);
		return "peliculas/index";
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String goAdd() {
		Pelicula peli= new Pelicula();
		peli.setTitulo("Prueba");
		peli.setDuracion(111);
		peli.setGenero("Prueba");
		peli.setClasificacion("B");
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		peli.setFechaEstreno(date);
		System.out.println(peli);
		//servicePeliculas.insert(peli);
		return "home";
	}
	
	
/* ======= */
	public String getTitulo() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8")); 
	    //System.out.println(generatedString);
		return generatedString;
	}
	public int getDuracion() {
		
		Random rand = null;
		@SuppressWarnings("null")
		int duracion = rand.nextInt((300 - 60) + 1) + 60;
		return duracion;
		
	}
	
}