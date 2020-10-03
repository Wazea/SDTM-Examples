package com.drvasile.design_patterns.creational.abstract_factory;

import com.drvasile.design_patterns.creational.factory_method.TeacherFactory;
import com.drvasile.design_patterns.creational.factory_method.abstraction.IFactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory teacherFactory = (TeacherFactory) Factory.createFactory("Teacher");
        IFactory administrationFactory = Factory.createFactory("Administration");

        teacherFactory.createObject("Professor");
        administrationFactory.createObject("Rector");
    }
}
