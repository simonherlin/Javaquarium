package fr.univlittoral.javaquarium.dao;

import java.util.List;

import fr.univlittoral.javaquarium.beans.data.PoissonDO;


public interface IPoissonDAO  {
	
	public PoissonDO create(PoissonDO poisson);
	public PoissonDO get(int id);
	public List<PoissonDO> getAll();
	public void update(PoissonDO poisson);
	public void delete(int id);
	public void deleteAll();
}