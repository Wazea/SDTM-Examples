package com.drvasile.examples.not_integrated.strategy;

import com.drvasile.examples.not_integrated.strategy.abstractions.GradingStrategy;

public class GradeAttestation implements GradingStrategy {

    @Override
    public void grade() {
        // It depends
        System.out.println("Grade attestation!");
    }
}
