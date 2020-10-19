package com.drvasile.design_patterns.structural.facade;

import com.drvasile.domain.models.actors.Student;

public class FacadeClient {

    public static final Integer NUMBER_OF_APPLICATIONS = 55;

    public static void main(String[] args) {

        int currentAge = 20;
        int ageInc = 1;
        double currentGrade = 5.56;
        double gradeInc = 1.0;

        for (int i = 0; i < NUMBER_OF_APPLICATIONS; i++) {
            Student student = new Student("A", "B", currentAge, currentGrade);
            AdmissionFacade.goToAdmission(student);

            currentAge += ageInc;
            if (currentAge > 40 && ageInc > 0) {
                ageInc *= -1;
            } else
            if (currentAge < 19 && ageInc < 0) {
                ageInc *= -1;
            }

            currentGrade += gradeInc;
            if (currentGrade > 10.0 && gradeInc > 0.0) {
                gradeInc *= -1.0;
            } else
            if (currentGrade < 5.0 && gradeInc < 0.0) {
                gradeInc *= -1.0;
            }
        }
    }
}
