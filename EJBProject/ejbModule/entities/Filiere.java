package entities;

import java.io.Serializable;
import java.lang.String;
import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: Filiere
 *
 */

@Entity

public class Filiere implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
	private String code;
	private String name;
	private static final long serialVersionUID = 1L;

	public Filiere() {
		super();
	}   
	
	
	public Filiere(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
