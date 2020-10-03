package com.drvasile.domain.models.courses;

import com.drvasile.domain.models.courses.abstraction.CourseTopic;
import com.drvasile.domain.models.courses.abstraction.TeachingLanguage;

public class EnglishTaughtCourse extends TeachingLanguage {

    public void translateToEnglish(CourseTopic course) {
        course.provideTheory();
        System.out.println("Translate course to english.");
    }

    public void teachCourse() {
        translateToEnglish(this.getCourse());
        System.out.println("Teach the course in english.");
    }
}
