package com.drvasile.domain.utilities.register.abstraction;

import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.models.courses.abstractions.CourseTopic;

public abstract class Register {

    private CourseTopic course;
    private Professor professor;
    private Student[] students;

    public CourseTopic getCourse() {
        return course;
    }

    public void setCourse(CourseTopic course) {
        this.course = course;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public abstract void makeAttendance();
}
