package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.structures.interfaces.SimpleEntity;
import com.drvasile.domain.models.structures.interfaces.IUniversityEntity;

public class Dean implements IUniversityEntity, SimpleEntity {

    @Override
    public String returnObject() {
        return toString();
    }

    @Override
    public String toString() {
        return "Dean";
    }
}
