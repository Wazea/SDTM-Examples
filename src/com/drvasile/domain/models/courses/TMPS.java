package com.drvasile.domain.models.courses;

import com.drvasile.domain.models.courses.abstraction.CourseTopic;

public class TMPS extends CourseTopic {

    @Override
    public void provideTheory() {
        System.out.println("Provide theory for TMPS");
    }
}
