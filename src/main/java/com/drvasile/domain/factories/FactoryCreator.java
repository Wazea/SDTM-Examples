package com.drvasile.domain.factories;

import com.drvasile.domain.factories.abstractions.IFactory;

public final class FactoryCreator {

    public static IFactory createFactory(String type) {
        switch (type) {
            case "Teacher": return TeachingFactory.getInstance();
            case "Administration": return AdministrationFactory.getInstance();
            default: return null;
        }
    }
}
