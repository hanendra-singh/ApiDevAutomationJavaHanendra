package com.hanendra.development.course.services;

import com.hanendra.development.course.modelentities.Course;
import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(int courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course course, int courseId);

    public void deleteCourse(int courseId);

}
