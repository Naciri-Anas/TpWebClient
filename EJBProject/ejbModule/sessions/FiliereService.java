package sessions;

import java.util.List;

import dao.IDao;
import entities.Filiere;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "G6FiliereS")
public class FiliereService implements IDao<Filiere>  {

	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@PermitAll
	public Filiere create(Filiere o) {
		em.persist(o);
		return o;
	}
	
	@Override
	@PermitAll
	public Filiere delete(Filiere o) {
		em.remove(o);
		return o;
	}

	@Override
	@PermitAll
	public Filiere update(Filiere o) {
		em.merge(o);
		return o;
	}

	@Override
	@PermitAll
	public Filiere findById(int id) {
		Filiere e= em.find(Filiere.class, id);
	     if(e==null) throw new RuntimeException("Filiere introvable");
	     return e;
	     
	}

	@Override
	@PermitAll
	public List<Filiere> findAll() {
		Query query = em.createQuery("select e from Filiere e");
		return  query.getResultList();
	}
}
