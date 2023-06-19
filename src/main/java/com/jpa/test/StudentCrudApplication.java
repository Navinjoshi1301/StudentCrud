package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(StudentCrudApplication.class, args);
	StudentRepo strepo =context.getBean(StudentRepo.class);
	Student st= new Student();
	st.setFirst_name("himi");
	st.setLast_name("saran");
	st.setGender("Male");
	st.setBranch("IT");
	Student stt=strepo.save(st);
	System.out.println(stt);
		
	}

}
