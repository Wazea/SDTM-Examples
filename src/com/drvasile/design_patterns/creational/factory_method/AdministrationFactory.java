package com.drvasile.design_patterns.creational.factory_method;

import com.drvasile.design_patterns.creational.factory_method.abstraction.IFactory;
import com.drvasile.domain.models.actors.Dean;
import com.drvasile.domain.models.actors.Rector;
import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;

public class AdministrationFactory implements IFactory {

    private static AdministrationFactory administrationFactoryInstance = null;

    private AdministrationFactory() {}

    public static AdministrationFactory getInstance() {
        if (administrationFactoryInstance == null) {
            synchronized (AdministrationFactory.class) {
                if (administrationFactoryInstance == null) {
                    administrationFactoryInstance = new AdministrationFactory();
                }
            }
        }

        return administrationFactoryInstance;
    }

    public IUniversityEmployee createObject(String type) {
        switch (type) {
            case "Rector": return new Rector();
            case "Dean": return new Dean();
            default: return null;
        }
    }
}
