package com.company.Collection;

import java.util.*;

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




    public static void main(String[] args) {

        class CourseIdComparator implements Comparator<Course> {
            @Override
            public int compare(Course c1, Course c2) {
                return c1.courseId - c2.courseId;
            }
        }


        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course(124, "AngularJS"));
        courseList.add(new Course(120, "Java"));
        courseList.add(new Course(121, "Hibernate"));

        Collections.sort(courseList);
        System.out.println(courseList);

// output: [124:AngularJS, 121:Hibernate, 120:Java]


        Set<Course> courseSet = new TreeSet<>();
        courseSet.add(new Course(124, "AngularJS"));
        courseSet.add(new Course(120, "Java"));
        courseSet.add(new Course(121, "Hibernate"));
        System.out.println(courseSet);

// output: [124:AngularJS, 121:Hibernate, 120:Java]
        Collections.sort(courseList, new CourseIdComparator());
        System.out.println(courseList);

    }


}

