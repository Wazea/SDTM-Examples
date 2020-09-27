package com.drvasile.design_patterns.creational.factory_method;

import com.drvasile.design_patterns.creational.factory_method.abstraction.IFactory;
import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.models.actors.UniversityAssistant;
import com.drvasile.domain.models.actors.interfaces.ITeacher;

public class TeacherFactory implements IFactory {

    private static TeacherFactory teacherFactoryInstance = null;

    private TeacherFactory() {}

    public static TeacherFactory getInstance() {
        if (teacherFactoryInstance == null) {
            synchronized (TeacherFactory.class) {
                if (teacherFactoryInstance == null) {
                    teacherFactoryInstance = new TeacherFactory();
                }
            }
        }

        return teacherFactoryInstance;
    }

    public ITeacher createTeacher(String type) {
        switch (type) {
            case "Professor": return new Professor();
            case "UniversityAssistant": return new UniversityAssistant();
            default: return null;
        }
    }
}
