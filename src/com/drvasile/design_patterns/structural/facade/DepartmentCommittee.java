package com.drvasile.design_patterns.structural.facade;

import com.drvasile.domain.models.actors.Student;

public class DepartmentCommittee {

    private static final Integer MAX_STUDENT_COUNT = 30;
    private static DepartmentCommittee instance = null;

    private Integer studentCount;
    private Student[] students;

    private DepartmentCommittee() {
        this.studentCount = 0;
        students = new Student[MAX_STUDENT_COUNT];
    }

    public static DepartmentCommittee getInstance() {
        if (instance == null) {
            synchronized (DepartmentCommittee.class) {
                if (instance == null) {
                    instance = new DepartmentCommittee();
                }
            }
        }

        return instance;
    }

    public void addStudentInformation(Student student) {
        if (this.studentCount < MAX_STUDENT_COUNT) {
            this.studentCount++;
            this.students[this.studentCount - 1] = student;
            System.out.println("Student added!");
        } else {
            System.out.println("Maximum number of students reached.");
        }

        System.out.println();
    }
}
