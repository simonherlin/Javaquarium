package fr.univlittoral.javaquarium.business.impl;

import fr.univlittoral.javaquarium.beans.data.PoissonDO;
import fr.univlittoral.javaquarium.beans.dto.PoissonDTO;
import fr.univlittoral.javaquarium.business.IPoissonService;
import fr.univlittoral.javaquarium.dao.IPoissonDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PoissonService implements IPoissonService
{
	@Autowired
	private IPoissonDAO poissonDAO;

	@Override
	public List<PoissonDTO> getAll() {
		
		final List<PoissonDO> poi = poissonDAO.getAll();
		
		List<PoissonDTO> poissons = new ArrayList<>();
		
		for(PoissonDO p : poi)
		{
			poissons.add(new PoissonDTO(0, p.getSpecie(), p.getDescription1() 
					+ " " + p.getDescription2() + " " + p.getDescription3(),
					p.getColor(), p.getLength() + " X " + p.getWidth(), p.getPrice()));
		}
		
		return poissons;
	}

	@Override
	public PoissonDTO create(PoissonDTO poisson) 
	{
		PoissonDO poissonSave = new PoissonDO();
		poissonSave.setSpecie(poisson.getSpecie());
		poissonSave.setDescription1(poisson.getDescription());
		String[] dims = poisson.getDimension().split(" X ");
		poissonSave.setWidth(Double.parseDouble(dims[0]));
		poissonSave.setLength(Double.parseDouble(dims[1]));
		poissonSave.setColor(poisson.getColor());
		
		poissonDAO.create(poissonSave );
		
		return poisson;
	}
	
}

