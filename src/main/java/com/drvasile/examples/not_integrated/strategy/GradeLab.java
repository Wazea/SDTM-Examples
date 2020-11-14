package com.drvasile.examples.not_integrated.strategy;

import com.drvasile.examples.not_integrated.strategy.abstractions.GradingStrategy;

public class GradeLab implements GradingStrategy {

    @Override
    public void grade() {
        // 50% Quiz 50% The project
        System.out.println("Grade lab!");
    }
}
