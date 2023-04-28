package com.badjo.onetomany.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "child")
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idchild;
	private String cfname,clname; 
	
	@ManyToOne
	@JoinColumn(name = "idfather")
	private Father father;

	
	public Child(String cfname, String clname, Father father) {
		super();
		this.cfname = cfname;
		this.clname = clname;
		this.father = father;
	}


	public Child(long idchild, String cfname, String clname, Father father) {
		super();
		this.idchild = idchild;
		this.cfname = cfname;
		this.clname = clname;
		this.father = father;
	}


	public long getIdchild() {
		return idchild;
	}


	public void setIdchild(long idchild) {
		this.idchild = idchild;
	}


	public String getCfname() {
		return cfname;
	}


	public void setCfname(String cfname) {
		this.cfname = cfname;
	}


	public String getClname() {
		return clname;
	}


	public void setClname(String clname) {
		this.clname = clname;
	}


	public Father getFather() {
		return father;
	}


	public void setFather(Father father) {
		this.father = father;
	}

	
	
	
}
