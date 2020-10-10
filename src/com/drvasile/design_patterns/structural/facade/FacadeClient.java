package com.drvasile.design_patterns.structural.facade;

import com.drvasile.domain.models.actors.Student;

public class FacadeClient {

    public static void main(String[] args) {
        Student student = new Student("A", "B", 20, 9.23);
        AdmissionFacade.goToAdmission(student);
    }
}
