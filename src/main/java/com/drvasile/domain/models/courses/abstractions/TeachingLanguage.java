package com.drvasile.domain.models.courses.abstractions;

public abstract class TeachingLanguage {

    // Composition
    private CourseTopic course;

    public CourseTopic getCourse() {
        return course;
    }

    public void setCourse(CourseTopic course) {
        this.course = course;
    }

    public abstract void teachCourse();
}
