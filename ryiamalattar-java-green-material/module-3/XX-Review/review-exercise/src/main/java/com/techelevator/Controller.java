package com.techelevator;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.CourseDAO;
import com.techelevator.domain.Course;

@RestController
public class Controller {

	private CourseDAO dao;
	
	public Controller(CourseDAO courseDao) {
		this.dao = courseDao;
	}
	
	@RequestMapping(path = "/courses" , method = RequestMethod.GET)
	public List<Course> getAllCourses(){
		return dao.getAllCourses();
	}
	
	@RequestMapping(path = "/courses/{id}" , method = RequestMethod.GET)
	public Course getCousrById(@PathVariable long id) {
		return dao.getCousrById(id);
	}
	
	@RequestMapping(path="/courses" , method =RequestMethod.POST) 
	public Course addCourse(@Valid @RequestBody Course course) {
		return dao.addCourse(course);
	}
	
	@RequestMapping(path = "/courses/{id}" , method = RequestMethod.PUT)
	public Course update(@RequestBody Course course, long id) {
		return dao.update(course, id);
	}
	
}
