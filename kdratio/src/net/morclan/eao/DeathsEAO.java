package net.morclan.eao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import net.morclan.enteties.Death;

public class DeathsEAO {
	@PersistenceContext(name="deathsPU")
	private EntityManager em;
	
	public void add(Death death) {
		em.persist(death);
	}
	public List<Death> getAll() {
		return (List<Death>) em.createQuery("SELECT d FROM deaths d",Death.class).getResultList();
	}
}
