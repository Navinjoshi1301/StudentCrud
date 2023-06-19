package com.jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
	@Autowired
 private StudentRepo repo;
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	public List<Student> saveStudents(List<Student> students) {
        return (List<Student>) repo.saveAll(students);
    }
	public List<Student> getStudents() {
        return (List<Student>) repo.findAll();
    }
	
	  public Student getStudentById(int id) {
	        return repo.findById(id).orElse(null);
	    }

	    public Student getStudentByName(String name) {
	        return repo.findByName(name);
	    }

	    public String deleteStudent(int id) {
	        repo.deleteById(id);
	        return "student removed !! " + id;
	    }
	
	    public Student updateStudent(Student student) {
	        Student existingStudent = repo.findById(student.getId()).orElse(null);
	       existingStudent.setFirst_name(student.getFirst_name());
	       existingStudent.setLast_name(student.getLast_name());
	       existingStudent.setGender(student.getGender());
	       existingStudent.setBranch(student.getBranch());
	        return repo.save(existingStudent);
	    }
	
	
}
