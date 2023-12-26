package com.solidprinciple.examples.liskovsubstitutionprinciple;

public class ComputerScienceCourse extends Course{
        public ComputerScienceCourse(String courseName, int courseCredits) {
            super(courseName, courseCredits);
        }

        @Override
        public String getDepartment() {
            return "Computer Science Department";
        }
    }


