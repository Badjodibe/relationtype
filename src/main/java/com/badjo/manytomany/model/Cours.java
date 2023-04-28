package com.badjo.manytomany.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcours;
	private String title;
	
	private Date started;
	
	@ManyToMany(mappedBy = "cours")
	private Set<Student> students = new HashSet<Student>();
	

	public Cours(String title, Date started) {
		super();
		this.title = title;
		this.started = started;
	}

	public Cours(String title, Date started, Set<Student> students) {
		super();
		this.title = title;
		this.started = started;
		this.students = students;
	}

	public long getIdcours() {
		return idcours;
	}

	public void setIdcours(long idcours) {
		this.idcours = idcours;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStarted() {
		return started;
	}

	public void setStarted(Date started) {
		this.started = started;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
