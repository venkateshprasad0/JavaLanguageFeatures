package com.company.Collection;

public class Course implements Comparable<Course> {
    public int courseId;
    public String courseName;

    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    @Override
    public int compareTo(Course otherCourse) {
        return this.courseName.compareTo(otherCourse.courseName);
    }

    @Override
    public String toString() {
        return this.courseId + ":" + this.courseName;
    }
}

