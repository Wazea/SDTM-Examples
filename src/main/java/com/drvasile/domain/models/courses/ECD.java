package com.drvasile.domain.models.courses;

import com.drvasile.domain.models.courses.abstractions.CourseTopic;

public class ECD extends CourseTopic {

    @Override
    public void provideTheory() {
        System.out.println("Provide theory for ECD.");
    }
}
