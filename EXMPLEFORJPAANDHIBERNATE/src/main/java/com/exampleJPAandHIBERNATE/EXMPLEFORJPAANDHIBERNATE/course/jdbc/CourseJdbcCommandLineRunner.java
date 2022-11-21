package com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{
	@Autowired
	private CourseJdbcRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn Jdbc","in 28 minutes"));
		repository.insert(new Course(2,"Learn Jpa","in 28 minutes1"));
		repository.insert(new Course(3,"Learn Jpa","in 28 minutes1"));
		//repository.delete(1);
		System.out.println(repository.findById(2));
		//System.out.println(repository.findById(3));
		
		
	}

}
