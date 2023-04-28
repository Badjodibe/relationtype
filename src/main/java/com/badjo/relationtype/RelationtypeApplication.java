package com.badjo.relationtype;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.badjo.onetoone.model.Car;
import com.badjo.onetoone.model.Person;
import com.badjo.onetoone.repositories.CarRepository;
import com.badjo.onetoone.repositories.PersonRepository;

@SpringBootApplication
@ComponentScan({"com.badjo.onetoone.services","com.badjo.onetoone.controller, com.badjo.oneto"
		+ "many.services", "com.badjo.onetomany.controller"})
@EntityScan({"com.badjo.onetoone.model, com.badjo.onetomany.model"})
@EnableJpaRepositories({"com.badjo.onetoone.repositories", "com.badjo.onetomany.repositories"})

public class RelationtypeApplication implements CommandLineRunner {

	@Autowired
	private  PersonRepository prepository;
	@Autowired
	private CarRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(RelationtypeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
		Person p1 = new Person("Badjo", "Koffi", "Taqadoum");
		Person p2 = new Person("Salifou", "Mohamed", "Mohamedia");
		Person p3 = new Person("Souelyman", "Salim", "Fes");
		Car car1 = new Car("Ford", "Red", "2021",  p1);
		Car car2 = new Car("Nissan", "White", "2022", p2);
		Car car3 = new Car("Toyota", "Silver", "2020", p3);
		prepository.saveAll(Arrays.asList(p1, p2, p3));
		repository.saveAll(Arrays.asList(car1, car2, car3));
	}
	
	

}
