package com.drvasile.domain.factories;

import com.drvasile.domain.factories.abstractions.IFactory;
import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.actors.teaching.UniversityAssistant;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;

public class TeachingFactory implements IFactory {

    private static TeachingFactory teachingFactoryInstance = null;

    private TeachingFactory() {}

    public static TeachingFactory getInstance() {
        if (teachingFactoryInstance == null) {
            synchronized (TeachingFactory.class) {
                if (teachingFactoryInstance == null) {
                    teachingFactoryInstance = new TeachingFactory();
                }
            }
        }

        return teachingFactoryInstance;
    }

    public IUniversityEmployee createObject(String type) {
        switch (type) {
            case "Professor": return new Professor();
            case "UniversityAssistant": return new UniversityAssistant();
            default: return null;
        }
    }
}
