package com.drvasile.domain.models.actors.administration;

import com.drvasile.domain.models.actors.abstractions.IAdministrationStaff;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;

public class Rector extends UniversityEntity implements IUniversityEmployee, IAdministrationStaff, ISimpleEntity {

    private String name;

    public Rector(String name) {
        this.name = name;
    }

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rector: " + this.name;
    }
}
