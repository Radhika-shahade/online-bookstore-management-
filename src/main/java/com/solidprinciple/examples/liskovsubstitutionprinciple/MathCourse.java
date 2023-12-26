package com.solidprinciple.examples.liskovsubstitutionprinciple;

public class MathCourse extends Course{
        public MathCourse(String courseName, int courseCredits) {
            super(courseName, courseCredits);
        }

        @Override
        public String getDepartment() {
            return "Mathematics Department";
        }
    }


