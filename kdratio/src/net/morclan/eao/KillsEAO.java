package net.morclan.eao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.morclan.enteties.Kill;

public class KillsEAO {
	@PersistenceContext(name="killsPU")
	private EntityManager em;
	
	public void add(Kill kill) {
		em.persist(kill);
	}
	public List<Kill> getAll() {
		List<Kill>all =em.createQuery("SELECT d FROM kills d",Kill.class).getResultList();
		return all;
	}
		
	
}
