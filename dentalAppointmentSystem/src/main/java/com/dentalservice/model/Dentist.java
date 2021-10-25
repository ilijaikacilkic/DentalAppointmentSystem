package com.dentalservice.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Embeddable
public class Dentist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")	
	private String surname;
	
	@Column(name="jmbg")
	private int jmbg;
	
	@Column(name="phone")
	private int phone;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getJmbg() {
		return jmbg;
	}

	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Dentist() {
		super();
	}

	public Dentist(String name, String surname, int jmbg, String email, int phone) {
		super();
		this.name = name;
		this.surname = surname;
		this.jmbg = jmbg;
		this.phone = phone;
	}

	public Dentist(int id, String name, String surname, int jmbg, String email, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.jmbg = jmbg;
		this.phone = phone;
	}

}
