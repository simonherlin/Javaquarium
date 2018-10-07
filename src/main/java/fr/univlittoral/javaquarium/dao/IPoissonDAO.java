package fr.univlittoral.javaquarium.dao;

import java.util.List;

import fr.univlittoral.javaquarium.beans.data.PoissonDO;


public interface IPoissonDAO  {
	/**
	 * Crud create Poisson
	 * @param poisson
	 * @return
	 */
	public PoissonDO create(PoissonDO poisson);
	
	/**
	 * Crud Get Poisson by Id
	 * @param id
	 * @return
	 */
	public PoissonDO get(int id);
	
	/**
	 * Crud get all Poisson
	 * @return
	 */
	public List<PoissonDO> getAll();
	
	/**
	 * Crud update Poisson
	 * @param poisson
	 */
	public void update(PoissonDO poisson);
	
	/**
	 * Crud dlete poisson by Id
	 * @param id
	 */
	public void delete(int id);
	
	/**
	 * Crud delete all poisson
	 */
	public void deleteAll();
}