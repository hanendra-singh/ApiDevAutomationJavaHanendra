package com.hanendra.development.entities;

public class Course {

    private Integer courseId;
    private String courseTitle;
    private String courseDescription;

    public Course(Integer courseId, String courseTitle, String courseDescription) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
    }

    public Course() {
        super();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }
}
