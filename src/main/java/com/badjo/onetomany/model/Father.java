package com.badjo.onetomany.model;

import java.util.LinkedList;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Father {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idfather;
	private String ffname, flname;
	
	@OneToMany(mappedBy = "father", cascade = CascadeType.ALL)
	private LinkedList<Child> childs;

	public Father(long idfather, String ffname, String flname, LinkedList<Child> childs) {
		super();
		this.idfather = idfather;
		this.ffname = ffname;
		this.flname = flname;
		this.childs = childs;
	}

	public Father(String ffname, String flname, LinkedList<Child> childs) {
		super();
		this.ffname = ffname;
		this.flname = flname;
		this.childs = childs;
	}

	public long getIdfather() {
		return idfather;
	}

	public void setIdfather(long idfather) {
		this.idfather = idfather;
	}

	public String getFfname() {
		return ffname;
	}

	public void setFfname(String ffname) {
		this.ffname = ffname;
	}

	public String getFlname() {
		return flname;
	}

	public void setFlname(String flname) {
		this.flname = flname;
	}

	public LinkedList<Child> getChilds() {
		return childs;
	}

	public void setChilds(LinkedList<Child> childs) {
		this.childs = childs;
	}

	
	
}
