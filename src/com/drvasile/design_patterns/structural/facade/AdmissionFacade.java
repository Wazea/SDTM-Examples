package com.drvasile.design_patterns.structural.facade;

import com.drvasile.domain.models.actors.Student;

public class AdmissionFacade {

    // Composition
    private static final AdmissionCommission admissionCommission = AdmissionCommission.getInstance();
    private static final DepartmentCommittee departmentCommittee = DepartmentCommittee.getInstance();

    // Objects that represent the sub-system
    public static void goToAdmission(Student student) {
        admissionCommission.gatherStudentInfo(student);
        departmentCommittee.addStudentInformation(student);
    }
}
