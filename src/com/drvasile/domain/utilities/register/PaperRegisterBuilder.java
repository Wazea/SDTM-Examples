package com.drvasile.domain.utilities.register;

import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.models.courses.Course;
import com.drvasile.domain.utilities.register.abstraction.RegisterBuilder;

public class PaperRegisterBuilder extends RegisterBuilder {

    public PaperRegisterBuilder() {
        this.setRegister(new PaperRegister());
    }

    @Override
    public RegisterBuilder putCourse() {
        this.getRegister().setCourse(new Course());
        return this;
    }

    @Override
    public RegisterBuilder putProfessor() {
        this.getRegister().setProfessor(new Professor());
        return this;
    }

    @Override
    public RegisterBuilder putStudentList() {
        System.out.println("Write student list.");
        return this;
    }
}
