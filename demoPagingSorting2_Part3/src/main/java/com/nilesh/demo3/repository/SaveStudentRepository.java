package com.nilesh.demo3.repository;

import org.springframework.data.repository.CrudRepository;

import com.nilesh.demo3.model.Student;

public interface SaveStudentRepository extends CrudRepository<Student, Integer> {

}
