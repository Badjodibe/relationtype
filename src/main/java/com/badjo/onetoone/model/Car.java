package com.badjo.onetoone.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCar;
	private String model,color, year;
	
	
	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "idPerson")
	private Person person;
	
	public Car() {
		
	}

	public Car(long idCar, String model, String color, String year, Person person) {
		super();
		this.idCar = idCar;
		this.model = model;
		this.color = color;
		this.year = year;
		this.person = person;
	}


	

	public Car(String model, String color, String year, Person person) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		this.person = person;
	}

	public long getIdCar() {
		return idCar;
	}
	public void setIdCar(long idCar) {
		this.idCar = idCar;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
}
