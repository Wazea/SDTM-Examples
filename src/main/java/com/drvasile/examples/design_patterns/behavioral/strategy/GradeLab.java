package com.drvasile.examples.design_patterns.behavioral.strategy;

import com.drvasile.examples.design_patterns.behavioral.strategy.abstractions.GradingStrategy;

public class GradeLab implements GradingStrategy {

    @Override
    public void grade() {
        // 50% Quiz 50% The project
        System.out.println("Grade lab!");
    }
}
