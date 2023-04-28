package com.badjo.manytomany.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idstudent;
	private String fname,lname;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name = "enrollement",
		joinColumns = @JoinColumn(name = "idstudent"),
		inverseJoinColumns = @JoinColumn(name = "idcours"))

	private Set<Cours> cours;

	

	public Student(String fname, String lname, Set<Cours> cours) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.cours = cours;
	}


	public long getIdstudent() {
		return idstudent;
	}


	public void setIdstudent(long idstudent) {
		this.idstudent = idstudent;
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


	public Set<Cours> getCours() {
		return cours;
	}


	public void setCours(Set<Cours> cours) {
		this.cours = cours;
	}
	
	
}
