package com.drvasile.design_patterns.structural.bridge;

import com.drvasile.domain.models.courses.EnglishTaughtCourse;
import com.drvasile.domain.models.courses.abstraction.TeachingLanguage;

public class BridgeClient {

    public static void main(String[] args) {
        TeachingLanguage teachingLanguage = new EnglishTaughtCourse();

        teachingLanguage.teachCourse();
    }
}
