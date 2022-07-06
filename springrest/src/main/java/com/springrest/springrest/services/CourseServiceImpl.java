package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		
		list.add(new Course(143,"java","java course"));
		list.add(new Course(144,"cpp","cpp course"));
		list.add(new Course(145,"c","c course"));
		list.add(new Course(146,"python","python course"));
		list.add(new Course(147,"javascript","javascript course"));
		
	}
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
				
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	
	}

}
