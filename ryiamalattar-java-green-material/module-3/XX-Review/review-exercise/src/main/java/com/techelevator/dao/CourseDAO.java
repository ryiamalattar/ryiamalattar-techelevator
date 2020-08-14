package com.techelevator.dao;

import java.util.List;

import com.techelevator.domain.Course;



public interface CourseDAO {

	public Course getCousrById(long id);
	public List<Course> getAllCourses();
	public Course addCourse(Course course);
	public Course update(Course course , long id);
	public void deleteCourse(long id);
	
}
