package fr.univlittoral.javaquarium.business;

import java.util.List;

import fr.univlittoral.javaquarium.beans.dto.*;

public interface IPoissonService {
	/**
	 * 
	 * @return
	 */
	public List<PoissonDTO> getAll();

	public PoissonDTO create(PoissonDTO poisson);
}
