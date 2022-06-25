package com.cg.springboot.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String name) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicName(name)
		.forEach(courses::add);
		return courses;
	}
	
	public List<Course> getCourse(String name) {
		return courseRepository.findByName(name);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void removeCourse(Integer id) {
		courseRepository.deleteById(id);		
	}

}
