package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	protected int id;
	protected String password;
	protected String login;
	protected static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<Role> role;

	public User() {
		super();
	}
	
	
	public User(String password, String login, List<Role> role) {
		super();
		this.password = password;
		this.login = login;
		this.role = role;
	}
	
	public User(String password, String login) {
		super();
		this.password = password;
		this.login = login;
	}
	


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
   
}
