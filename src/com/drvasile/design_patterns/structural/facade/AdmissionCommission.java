package com.drvasile.design_patterns.structural.facade;

import com.drvasile.domain.models.actors.Student;

public class AdmissionCommission {

    private static AdmissionCommission instance = null;

    private Student student;

    private AdmissionCommission() {}

    public static AdmissionCommission getInstance() {
        if (instance == null) {
            synchronized (AdmissionCommission.class) {
                if (instance == null) {
                    instance = new AdmissionCommission();
                }
            }
        }

        return instance;
    }

    public void gatherStudentInfo(Student student) {
        this.student = student;
        System.out.println("Student information gathered: ");
        System.out.println("Name :" + this.student.getName());
        System.out.println("Surname :" + this.student.getSurname());
        System.out.println("Age :" + this.student.getAge());
        System.out.println();
    }
}
