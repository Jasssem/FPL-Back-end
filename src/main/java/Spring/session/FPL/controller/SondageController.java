package Spring.session.FPL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Spring.session.FPL.entities.Sondage;
import Spring.session.FPL.entities.User;
import Spring.session.FPL.services.SondageService;

@RestController
@RequestMapping("/sondage")
public class SondageController {
	
	
	@Autowired
	SondageService sondageservice;
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	public void addSondage(@RequestBody Sondage sondage) {
		System.out.println("message");
		sondageservice.AjoutSondage(sondage);
	}
}
