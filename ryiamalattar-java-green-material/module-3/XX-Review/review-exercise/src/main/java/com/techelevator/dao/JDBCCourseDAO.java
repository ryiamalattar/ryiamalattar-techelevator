package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.domain.Course;

@Component
public class JDBCCourseDAO implements CourseDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCCourseDAO (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public List<Course> getAllCourses() {
		List<Course> listOfCourses = new ArrayList<Course>();
		String sql = "SELECT * FROM course";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		
		while (results.next()) {
			listOfCourses.add(mapRowToCourse(results));
		}
		return listOfCourses;
	}
	

	@Override
	public Course getCousrById(long id) {
		Course theCourse = null;
		String sql = "SELECT * FROM course WHERE id =?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql , id);
		
		if (results.next()) {
			theCourse = mapRowToCourse(results);
		}
		return theCourse;
	}
	
  
	@Override
	public Course addCourse(Course course) {
		String sql = "INSERT into course (id , course_name , desecription) " +
					"VALUES (default , ? , ?) returning id";
		
		Long id = jdbcTemplate.queryForObject(sql, Long.class , course.getName() , course.getDesecription());
		course.setId(id);
		
		return course;
	}
	
	

	@Override
	public Course update(Course course, long id) {
		
		String sql = "update course " + "set course_name = ? , description = ? " + "where id = ?";
		
		jdbcTemplate.update(sql, course.getName() , course.getDesecription() , course.getId());
		course.setId(id);
		
		return course;
	}

	@Override
	public void deleteCourse(long id) {
		
		String sql = "DELETE FROM course " + "WHERE id = ?";
		jdbcTemplate.update(sql , id);
	}

private Course mapRowToCourse(SqlRowSet rs) {
		
		Course course = new Course();
		course.setId(rs.getLong("id"));
		course.setName(rs.getString("course_name"));
		course.setDesecription("description");
	
		return course;
}
	
	

}
