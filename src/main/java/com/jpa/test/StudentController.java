package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	 @PostMapping("/addStudents")
	    public List<Student> addProducts(@RequestBody List<Student> students) {
	        return service.saveStudents(students);
	    }

	    @GetMapping("/students")
	    public List<Student> findAllProducts() {
	        return service.getStudents();
	    }

	    @GetMapping("/studentById/{id}")
	    public Student findProductById(@PathVariable int id) {
	        return service.getStudentById(id);
	    }

	    @GetMapping("/student/{name}")
	    public Student findProductByName(@PathVariable String name) {
	        return service.getStudentByName(name);
	    }

	    @PutMapping("/update")
	    public Student updateProduct(@RequestBody Student student) {
	        return service.updateStudent(student);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return service.deleteStudent(id);
	    }
	
	
	
	
	
}
