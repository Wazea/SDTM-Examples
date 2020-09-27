package com.drvasile.design_patterns.creational.abstract_factory;

import com.drvasile.design_patterns.creational.factory_method.AdministrationFactory;
import com.drvasile.design_patterns.creational.factory_method.TeacherFactory;
import com.drvasile.design_patterns.creational.factory_method.abstraction.IFactory;

public final class Factory {

    public static IFactory createFactory(String type) {
        switch (type) {
            case "Teacher": return TeacherFactory.getInstance();
            case "Administration": return AdministrationFactory.getInstance();
            default: return null;
        }
    }
}
