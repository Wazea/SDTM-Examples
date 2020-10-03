package com.drvasile.domain.utilities.register;

import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.utilities.register.abstraction.RegisterBuilder;

public class ElectronicRegisterBuilder extends RegisterBuilder {

    public ElectronicRegisterBuilder() {
        this.setRegister(new ElectronicRegister());
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
        System.out.println("Fetch student list from DB.");
        return this;
    }
}
