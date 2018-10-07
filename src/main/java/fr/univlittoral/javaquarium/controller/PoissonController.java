package fr.univlittoral.javaquarium.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univlittoral.javaquarium.beans.dto.PoissonDTO;
import fr.univlittoral.javaquarium.beans.dto.PoissonsDTO;
import fr.univlittoral.javaquarium.business.IPoissonService;


@RestController
public class PoissonController 
{
	@Autowired
	private IPoissonService poissonService;
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/poisson", method = RequestMethod.GET)
	public PoissonsDTO getPoissons()
	{
		final List<PoissonDTO> poissons = poissonService.getAll();
		return new PoissonsDTO(poissons);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/poisson")
	public void createPoisson(@RequestBody PoissonDTO poisson)
	{
		poissonService.create(poisson);
	}
}
