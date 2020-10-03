package com.drvasile.design_patterns.creational.factory_method.abstraction;

import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;

public interface IFactory {
    IUniversityEmployee createObject(String type);
}
