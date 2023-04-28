package com.badjo.onetoone.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPerson;
	private String fname, lname, adress;
	
	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Car car;
	
	public Person() {
		
	}
	
	public Person(long idPerson, String fname, String lname, String adress, Car car) {
		super();
		this.idPerson = idPerson;
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
		this.car = car;
	}

	public Person(String fname, String lname, String adress) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
	}

	public long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
