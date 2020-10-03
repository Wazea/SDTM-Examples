package com.drvasile.design_patterns.structural.bridge;

import com.drvasile.domain.models.courses.*;
import com.drvasile.domain.models.courses.abstraction.TeachingLanguage;

public class BridgeClient {

    public static void main(String[] args) {

        TeachingLanguage teachingLanguage = new EnglishTaughtCourse();
        teachingLanguage.setCourse(new NetProgramming());
        teachingLanguage.teachCourse();

        System.out.println();

        TeachingLanguage teachingLanguage1 = new RussianTaughtCourse();
        teachingLanguage1.setCourse(new ECD());
        teachingLanguage1.teachCourse();
    }
}
