package com.hanendra.development.services;

import com.hanendra.development.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> coursesList;

    public CourseServiceImpl() {
        coursesList=new ArrayList<>();
        coursesList.add(new Course(100, "JAVA", "This is a java course"));
        coursesList.add(new Course(101, "PYTHON", "This is a Python course"));
    }

    @Override
    public List<Course> getCourses() {
        return coursesList;
    }

    @Override
    public Course getCourse(int courseId) {
        Course c = null ;
        for(Course course : coursesList){
            if(course.getCourseId() == courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        coursesList.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course updatedCourse, int courseId) {
        Course c = null ;
        for(Course course : coursesList){
            if(course.getCourseId() == courseId){
                coursesList.remove(course);
                coursesList.add(updatedCourse);
                c=updatedCourse;
                break;
            }
        }
        return c;
    }

    @Override
    public void deleteCourse(int courseId) {
        for(Course course : coursesList){
            if(course.getCourseId() == courseId){
                coursesList.remove(course);
                break;
            }
        }
    }

}
