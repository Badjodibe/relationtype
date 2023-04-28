package com.badjo.onetoone.repositories;


import org.springframework.data.repository.CrudRepository;

import com.badjo.onetoone.model.Car;


public interface CarRepository extends CrudRepository<Car, Long> {

	Iterable<Car> findByYear(String year);

}
