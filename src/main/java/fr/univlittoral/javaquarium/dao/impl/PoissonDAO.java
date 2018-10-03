package fr.univlittoral.javaquarium.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univlittoral.javaquarium.beans.data.PoissonDO;
import fr.univlittoral.javaquarium.dao.IPoissonDAO;;

@Component
public class PoissonDAO implements IPoissonDAO {
	
	@Autowired
	private EntityManager em;
	
	public PoissonDO create(PoissonDO poisson) {
		em.getTransaction().begin();
		em.persist(poisson);
		em.getTransaction().commit();
		return poisson;
	}
	
	public PoissonDO get(int id) {
		return em.find(PoissonDO.class, id);
	}
	public List<PoissonDO> getAll() {
		return em
				.createQuery("select p from PoissonDO p", PoissonDO.class )
				.getResultList();
	}
	public void update(PoissonDO poisson) {
		
	}
	public void delete(int id) {
		
	}
	public void deleteAll() {
		
	}
}