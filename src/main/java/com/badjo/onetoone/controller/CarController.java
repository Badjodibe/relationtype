package com.badjo.onetoone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.badjo.onetoone.model.Car;
import com.badjo.onetoone.services.CarServices;

@RestController
public class CarController {

	@Autowired
	private CarServices carservice;
	
	@GetMapping("/Cars/{id}")
	public Car findCarById(@PathVariable("id") long id) {
		return carservice.findCarById(id);
	}
	
	/*
	 @GetMapping("/Cars/{year}")

	public Iterable<Car> findCarByYear(@PathVariable("year") String year){
		return carservice.finCarByYear(year);
	}
	*/
	@PostMapping(path = "/Car",
			 	consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCar(Car car) {
		carservice.addCar(car);
	}
	@GetMapping("/Cars")
	public Iterable<Car> getAll(){
		return carservice.getAll();
	}
	
}
