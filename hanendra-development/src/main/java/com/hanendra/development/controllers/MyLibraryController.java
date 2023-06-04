package com.hanendra.development.controllers;

import com.hanendra.development.entities.Course;
import com.hanendra.development.services.CourseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class MyLibraryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyLibraryController.class);
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String HomeTest(){
        return "this is home page for testing";
    }


    // Get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        LOGGER.debug("calling - /course");
        LOGGER.info("calling - /course");
        return this.courseService.getCourses();
    }

    // Get a Specific Course
    @GetMapping("/courses/{courseId}")
    public Course getCourses(@PathVariable int courseId){
        return this.courseService.getCourse(courseId);
    }

    // Get a Specific Course
    @PostMapping("/courses")
    public Course addCourses(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    // Update a Specific Course
    @PutMapping("/courses/{courseId}")
    public Course updateCourses(@RequestBody Course course, @PathVariable int courseId){
        return this.courseService.updateCourse(course, courseId);
    }

    // Delete a Specific Course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int courseId){
        try{
            this.courseService.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
