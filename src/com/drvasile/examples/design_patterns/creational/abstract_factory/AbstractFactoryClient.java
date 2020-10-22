package com.drvasile.examples.design_patterns.creational.abstract_factory;

import com.drvasile.domain.factories.FactoryCreator;
import com.drvasile.domain.factories.TeachingFactory;
import com.drvasile.domain.factories.abstractions.IFactory;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;

public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory teacherFactory = (TeachingFactory) FactoryCreator.createFactory("Teacher");
        IFactory administrationFactory = FactoryCreator.createFactory("Administration");

        IUniversityEmployee professor = teacherFactory.createObject("Professor");
        IUniversityEmployee rector = administrationFactory.createObject("Rector");

        System.out.println(professor.toString());
        System.out.println(rector.toString());
    }
}
