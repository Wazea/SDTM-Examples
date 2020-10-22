package com.drvasile.domain.utilities.register.abstraction;

public abstract class RegisterBuilder {

    private Register register;

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public abstract RegisterBuilder putCourse();
    public abstract RegisterBuilder putProfessor();
    public abstract RegisterBuilder putStudentList();
}
