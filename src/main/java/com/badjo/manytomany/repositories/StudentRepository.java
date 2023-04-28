package com.badjo.manytomany.repositories;

import org.springframework.data.repository.CrudRepository;

import com.badjo.manytomany.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
