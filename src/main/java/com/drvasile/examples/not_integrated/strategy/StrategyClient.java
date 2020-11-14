package com.drvasile.examples.not_integrated.strategy;

import java.util.Scanner;

public class StrategyClient {

    private static final GradeExam gradeExam = new GradeExam();
    private static final GradeAttestation gradeAttestation = new GradeAttestation();
    private static final GradeLab gradeLab = new GradeLab();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.next();
            switch (userInput) {
                case "Exam": gradeExam.grade(); break;
                case "Attest": gradeAttestation.grade(); break;
                case "Lab": gradeLab.grade(); break;
                case "Done": return;
                default:
                    System.out.println("Not recognized.");
            }
        }
    }
}
