package entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import jakarta.persistence.*;

import jakarta.persistence.Entity;

/**
 * Entity implementation class for Entity: student
 *
 */
@Entity

public class student  extends User implements Serializable {

	
	private String firstName;
	private String lastName;
	private String telephone;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Filiere filiere;

	public student() {
		super();
	} 
	
	
	
	public student(String password, String login, List<Role> role,String firstName, String lastName, String telephone, Filiere filiere) {
		super(password, login, role);
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.filiere = filiere;
		
	}
	

	public student(String password, String login,String firstName, String lastName, String telephone, Filiere filiere) {
		super(password, login);
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.filiere = filiere;
		
	}

   

	public student(String firstName, String lastName, String telephone, Filiere filiere) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.filiere = filiere;
	}



	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
   
}
