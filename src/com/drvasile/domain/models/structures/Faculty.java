package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.structures.interfaces.IComplexEntity;
import com.drvasile.domain.models.structures.interfaces.IUniversityEntity;

public class Faculty implements IUniversityEntity, IComplexEntity {

    @Override
    public String toString() {
        return "Faculty";
    }
}
