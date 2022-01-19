package br.com.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer idUser;
	
	@Column (length = 50)
	private String name;
	
	@Column (length = 100)
	private String lastName;
	
    @Column(length =200)
    private String email;

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(Integer idUser, String name, String lastName, String email) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.lastName= lastName;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
	
	
}

