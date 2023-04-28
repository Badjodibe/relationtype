package com.badjo.onetoone.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.badjo.onetoone.model.Car;
import com.badjo.onetoone.repositories.CarRepository;

@Service
public class CarServices {

	@Autowired
	private CarRepository carsrepo;
	
	public Car findCarById(long id) {
		return  carsrepo.findById(id).get();
	}
	
	public Iterable<Car> finCarByYear(String year){
		return carsrepo.findByYear(year);
	}
	public void addCar(Car car) {
		carsrepo.save(car);
	}
	public Iterable<Car> getAll(){
		return carsrepo.findAll();
	}
}
