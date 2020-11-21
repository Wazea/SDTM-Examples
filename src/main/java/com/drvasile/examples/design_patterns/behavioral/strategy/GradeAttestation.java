package com.drvasile.examples.design_patterns.behavioral.strategy;

import com.drvasile.examples.design_patterns.behavioral.strategy.abstractions.GradingStrategy;

public class GradeAttestation implements GradingStrategy {

    @Override
    public void grade() {
        // It depends
        System.out.println("Grade attestation!");
    }
}
