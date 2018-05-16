package unae.lp3.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/paginas")
public class PageController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String goIndex()
	{
		return  "pages/index";
	}
	@RequestMapping(value="/saludo", method=RequestMethod.GET)
	public String goSaludo()
	{
		return  "pages/saludo";
	}	
	
}