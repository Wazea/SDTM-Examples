package com.drvasile.design_patterns.creational.builder;

import com.drvasile.domain.utilities.register.ElectronicRegisterBuilder;
import com.drvasile.domain.utilities.register.PaperRegisterBuilder;
import com.drvasile.domain.utilities.register.abstraction.Register;
import com.drvasile.domain.utilities.register.abstraction.RegisterBuilder;

public class BuilderClient {

    public static void main(String[] args) {
        RegisterBuilder registerBuilder0 = new PaperRegisterBuilder();
        RegisterBuilder registerBuilder1 = new ElectronicRegisterBuilder();

        // The order of the methods being called doesn't matter, of course
        registerBuilder0.putCourse().putProfessor().putStudentList();
        registerBuilder1.putStudentList().putProfessor().putCourse();

        Register paperRegister = registerBuilder0.getRegister();
        Register electronicRegister = registerBuilder1.getRegister();

        paperRegister.makeAttendance();
        electronicRegister.makeAttendance();
    }
}
