package com.hanendra.development.services;

import com.hanendra.development.entities.Course;
import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(int courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course, int courseId);

    public void deleteCourse(int courseId);

}
