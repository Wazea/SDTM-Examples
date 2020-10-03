package com.drvasile.design_patterns.creational.abstract_factory;

import com.drvasile.design_patterns.creational.factory_method.TeacherFactory;
import com.drvasile.design_patterns.creational.factory_method.abstraction.IFactory;
import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory teacherFactory = (TeacherFactory) Factory.createFactory("Teacher");
        IFactory administrationFactory = Factory.createFactory("Administration");

        IUniversityEmployee professor = teacherFactory.createObject("Professor");
        IUniversityEmployee rector = administrationFactory.createObject("Rector");

        System.out.println(professor.toString());
        System.out.println(rector.toString());
    }
}
