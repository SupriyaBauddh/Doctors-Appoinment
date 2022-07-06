package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	public CourseService courseService1;
	
@GetMapping("/home")
public String home()
{
	return "this is home";
}

//get courses
@GetMapping("/courses")
public List<Course> getCourses()
{
	return this.courseService1.getCourses();
}

//get single course
@GetMapping("/course/{courseId}")
public Course getCourse(@PathVariable String courseId)
{
	return this.courseService1.getCourse(Long.parseLong(courseId));
}
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course)
{
	return this.courseService1.addCourse(course);
}

}
