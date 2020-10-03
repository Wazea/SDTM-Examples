package com.drvasile.domain.utilities.register;

import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.utilities.register.abstraction.RegisterBuilder;

public class PaperRegisterBuilder extends RegisterBuilder {

    public PaperRegisterBuilder() {
        this.setRegister(new PaperRegister());
    }

    @Override
    public RegisterBuilder putCourse() {
        return this;
    }

    @Override
    public RegisterBuilder putProfessor() {
        this.getRegister().setProfessor(new Professor());
        return this;
    }

    @Override
    public RegisterBuilder putStudentList() {
        this.getRegister().setStudents(new Student[] { new Student() });
        return this;
    }
}