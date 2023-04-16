package com.example.collegeApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegeApi.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	public Course findByCourseName(String courseName);
}
