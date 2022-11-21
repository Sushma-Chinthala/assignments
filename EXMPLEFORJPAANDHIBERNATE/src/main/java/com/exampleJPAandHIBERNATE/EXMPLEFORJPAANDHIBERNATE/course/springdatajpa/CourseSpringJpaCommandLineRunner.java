package com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.Course;
@Component
public class CourseSpringJpaCommandLineRunner implements CommandLineRunner{
	@Autowired
  private CourseSpringDataRepository repository;
   
  @Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn AWSs","in 28 minutes"));
		repository.save(new Course(2,"Learn AWS1s","in 28 minutes1"));
		repository.save(new Course(3,"Learn AWS2","in 28 minutes1"));
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		//repository.findAll();
		System.out.println(repository.findByAuthor("in 28 minutes1"));
		System.out.println(repository.findByName("Learn AWS1s"));
	
}
}
