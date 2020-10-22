package com.drvasile.domain.models.courses;

import com.drvasile.domain.models.courses.abstractions.CourseTopic;
import com.drvasile.domain.models.courses.abstractions.TeachingLanguage;

public class RussianTaughtCourse extends TeachingLanguage {

    public void translateToRussian(CourseTopic course) {
        course.provideTheory();
        System.out.println("Translate course to russian.");
    }

    public void teachCourse() {
        translateToRussian(this.getCourse());
        System.out.println("Teach the course in russian.");
    }
}
