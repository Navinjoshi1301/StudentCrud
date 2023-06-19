package com.jpa.test;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student,Integer>{ 

Student findByName(String name);
}
