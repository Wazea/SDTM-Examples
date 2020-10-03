package com.drvasile.domain.models.courses;

import com.drvasile.domain.models.courses.abstraction.Course;
import com.drvasile.domain.models.courses.abstraction.TeachingLanguage;

public class EnglishTaughtCourse extends TeachingLanguage {

    public void translateToEnglish(Course course) {
        System.out.println("Translate course to english.");
    }

    public void teachCourse() {
        translateToEnglish(this.course);
        System.out.println("Teach the course in english.");
    }
}
