package fr.univlittoral.javaquarium.beans.dto;

import java.util.List;

public class PoissonsDTO {
	private List<PoissonDTO> poissons;
	
	public PoissonsDTO(List<PoissonDTO> poissons) {
		this.poissons= poissons;
	}

	public List<PoissonDTO> getPoissons() {
		return this.poissons;
	}

	public void setPoissons(List<PoissonDTO> poissons) {
		this.poissons = poissons;
	}
}