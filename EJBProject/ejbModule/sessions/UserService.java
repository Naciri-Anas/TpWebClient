package sessions;

import java.util.List;

import dao.IDao;
import dao.IdaoLocal;
import entities.User;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless(name = "G6UserS")
public class UserService implements IDao<User>,IdaoLocal<User> {
	
	@PersistenceContext 
	private EntityManager em;
	
	@Override
	@PermitAll
	public User create(User o) {
		em.persist(o);
		return o;
	}
	
	@Override
	@PermitAll
	public User delete(User o) {
		em.remove(o);
		return o;
	}

	@Override
	@PermitAll
	public User update(User o) {
		em.merge(o);
		return o;
	}

	@Override
	@PermitAll
	public User findById(int id) {
		User  e= em.find(User.class, id);
	     if(e==null) throw new RuntimeException("user introvable");
	     return e;
	     
	}

	@Override
	@PermitAll
	public List<User> findAll() {
		Query query = em.createQuery("select e from User e");
		return  query.getResultList();
	}
}
