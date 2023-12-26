package com.solidprinciple.examples.liskovsubstitutionprinciple;

public class College {
        public void displayCourseDetails(Course[] courses) {
            for (Course course : courses) {
                System.out.println("Course Name: " + course.getCourseName());
                System.out.println("Department: " + course.getDepartment());
                System.out.println("Credits: " + course.getCourseCredits());
                System.out.println();
            }
        }
    }


