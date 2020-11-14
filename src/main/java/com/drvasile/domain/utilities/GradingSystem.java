package com.drvasile.domain.utilities;

import com.drvasile.examples.not_integrated.strategy.GradeAttestation;
import com.drvasile.examples.not_integrated.strategy.GradeExam;
import com.drvasile.examples.not_integrated.strategy.GradeLab;

public class GradingSystem {

    private static final GradeLab gradeLab = new GradeLab();
    private static final GradeAttestation gradeAttest = new GradeAttestation();
    private static final GradeExam gradeExam = new GradeExam();

    public static void gradeWork(String type) {
        switch (type) {
            case "lab": gradeLab.grade(); break;
            case "attestation": gradeAttest.grade(); break;
            case "exam": gradeExam.grade(); break;
            default: break;
        }
    }
}
