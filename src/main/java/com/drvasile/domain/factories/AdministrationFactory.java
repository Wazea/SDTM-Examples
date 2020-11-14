package com.drvasile.domain.factories;

import com.drvasile.domain.factories.abstractions.IFactory;
import com.drvasile.domain.models.actors.administration.Dean;
import com.drvasile.domain.models.actors.administration.Rector;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;

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
            case "Rector": return new Rector("Name");
            case "Dean": return new Dean("Name");
            default: return null;
        }
    }
}
