package com.drvasile.examples.design_patterns.behavioral.strategy;

import com.drvasile.examples.design_patterns.behavioral.strategy.abstractions.GradingStrategy;

public class GradeExam implements GradingStrategy {

    @Override
    public void grade() {
        // 30% 1st Att 30% 2nd Att 40% Exam
        System.out.println("Grade exam!");
    }
}
