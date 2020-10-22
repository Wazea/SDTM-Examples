package com.drvasile.domain.models.actors.administration;

import com.drvasile.domain.models.actors.abstractions.IAdministration;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class Dean extends UniversityEntity implements IAdministration, ISimpleEntity, IUniversityEmployee {

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dean";
    }
}
