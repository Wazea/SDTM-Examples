package com.drvasile.domain.models.actors.administration;

import com.drvasile.domain.models.actors.abstractions.IAdministration;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;

public class Rector extends UniversityEntity implements IUniversityEmployee, IAdministration, ISimpleEntity {

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rector";
    }
}
