package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.structures.interfaces.IUniversityEntity;
import com.drvasile.domain.models.structures.interfaces.SimpleEntity;

public class Rector implements IUniversityEntity, SimpleEntity {

    @Override
    public String returnObject() {
        return toString();
    }
}
