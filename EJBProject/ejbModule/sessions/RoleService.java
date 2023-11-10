package sessions;

import java.util.List;

import dao.IDao;
import entities.Role;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "G6RoleS")
public class RoleService implements IDao<Role> {

	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@PermitAll
	public Role create(Role o) {
		em.persist(o);
		return o;
	}
	
	@Override
	@PermitAll
	public Role delete(Role o) {
		em.remove(o);
		return o;
	}

	@Override
	@PermitAll
	public Role update(Role o) {
		em.merge(o);
		return o;
	}

	@Override
	@PermitAll
	public Role findById(int id) {
		Role e= em.find(Role.class, id);
	     if(e==null) throw new RuntimeException("Role introvable");
	     return e;
	     
	}

	@Override
	@PermitAll
	public List<Role> findAll() {
		Query query = em.createQuery("select e from Role e");
		return  query.getResultList();
	}
}
