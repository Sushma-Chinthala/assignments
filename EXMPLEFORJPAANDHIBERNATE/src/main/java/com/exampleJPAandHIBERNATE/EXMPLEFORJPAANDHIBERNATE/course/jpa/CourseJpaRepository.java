package com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.Course;

@Repository   //Connects to the database
@Transactional
public class CourseJpaRepository 
{
	@PersistenceContext
	private EntityManager entityManager;//manages the entity
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	public Course fingById(long id)
	{
	return	entityManager.find(Course.class,entityManager);
	}
	public void  deleteById(long id)
	{
		Course course=entityManager.find(Course.class,id);
	entityManager.remove(course);
	}
	
	
	
}
