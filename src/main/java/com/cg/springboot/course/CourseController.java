package com.cg.springboot.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboot.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/topics/{name}/courses")
	public List<Course> getAllCourses(@PathVariable String name) {
		return courseService.getAllCourses(name);
	}
	
	@GetMapping("/topics/{topicName}/courses/{name}")
	public List<Course> getCourseByName(@PathVariable String name) {
		return courseService.getCourse(name);
	}
	
	@PostMapping("/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable Integer topicId) {
		course.setTopic(new Topic(topicId, "",""));
		 courseService.addCourse(course);
	}
	
	@PutMapping("/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable Integer topicId, @PathVariable Integer id) {
		course.setTopic(new Topic(topicId, "",""));
		 courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable Integer id) {
		 courseService.removeCourse(id);
	}

}
