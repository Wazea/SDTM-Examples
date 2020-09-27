package com.drvasile.domain.utilities.register.abstraction;

import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.models.courses.Course;

public abstract class Register {

    private Course course;
    private Professor professor;
    private Student[] students;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
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
