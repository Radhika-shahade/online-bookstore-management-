package com.solidprinciple.examples.liskovsubstitutionprinciple;

public class LSPApplication {
    public static void main(String[] args) {
        // Create instances of different types of courses
        Course mathCourse = new MathCourse("Abacus", 4);
        Course csCourse = new ComputerScienceCourse("Java Programming", 3);

        // Display details of the courses using the College class
        College college = new College();
        Course[] courses = {mathCourse, csCourse};
        college.displayCourseDetails(courses);
    }
}
