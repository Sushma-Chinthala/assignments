package com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.jpa.CourseJpaRepository;



//import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.jdbc.CourseJdbcRepository;
//import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.jpa.CourseJpaRepository;
@Component
public class CourseCommandLineRunner 
{
	//@Autowired
	//private CourseJpaRepository repository;
	@Autowired
	private CourseJpaRepository repository;
    
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn AWS","in 28 minutes"));
		repository.insert(new Course(2,"Learn AWS1","in 28 minutes1"));
		repository.insert(new Course(3,"Learn AWS2","in 28 minutes1"));
		repository.deleteById(1l);
		System.out.println(repository.fingById(2l));
		System.out.println(repository.fingById(3l));
		
		 

}
}
