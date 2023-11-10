package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity

public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private String name;
	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<User> user;

	public Role() {
		super();
	}  
	
	
	public Role(String name, List<User> user) {
		super();
		this.name = name;
		this.user = user;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
   
}
