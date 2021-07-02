package com.training.ApiRest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	// Atributos 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idUser")
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mail")	
	private String mail;
	
	@Column(name="idRol")
	private int idRol;
	
	
	// Constructor 
	
	public User() {
		// constructor por defecto
	}
	
	// Sobrecargas 
	
	public User (int id, String userName, String password, String mail, int idRol) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.mail = mail;
		this.idRol = idRol;
	}
	
	// Getters && Setters 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	} 
	
	
	// Metodos 
	
	@Override
	public String toString() {
		return "User [id= "+id+", name= "+userName+", password= "+password+", mail= "+mail+", idRol= "+idRol+"]";
	}
	
	
	
	
	
	
	
	
}
