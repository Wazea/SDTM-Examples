package com.drvasile.domain.models.actors.administration;

import com.drvasile.domain.models.actors.abstractions.IAdministrationStaff;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class Dean extends UniversityEntity implements IAdministrationStaff, ISimpleEntity, IUniversityEmployee {

    private String name;

    public Dean(String name) {
        this.name = name;
    }

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dean: " + this.name;
    }
}
