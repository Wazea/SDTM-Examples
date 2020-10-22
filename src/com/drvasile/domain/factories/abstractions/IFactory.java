package com.drvasile.domain.factories.abstractions;

import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;

public interface IFactory {
    IUniversityEmployee createObject(String type);
}
