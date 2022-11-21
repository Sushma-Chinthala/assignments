package com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleJPAandHIBERNATE.EXMPLEFORJPAANDHIBERNATE.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course,Long>
{
List<Course> findByAuthor(String author);
List<Course> findByName(String name);
}