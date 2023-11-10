import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.IDao;
import entities.Filiere;
import entities.Role;
import entities.User;
import entities.student;

public class Test {
	public static IDao<User> lookUpEmployeRemote() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		final Context context = new InitialContext(jndiProperties);

		return (IDao<User>) context.lookup("ejb:ANEAR/EJBProject/G6UserS!dao.IDao");

	}
	public static void main(String[] args) {
		try {
			IDao<User> dao = lookUpEmployeRemote();
			dao.create(new User("RAMI", "Samir"));
			dao.create(new User("SAFI", "Imane"));
			dao.create(new User("ALAMI", "Kamal"));
			
			for(User e : dao.findAll())
				System.out.println(e.getLogin());
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

