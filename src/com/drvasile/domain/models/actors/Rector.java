package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.actors.interfaces.IAdministration;
import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;
import com.drvasile.domain.models.structures.interfaces.UniversityEntity;
import com.drvasile.domain.models.structures.interfaces.ISimpleEntity;

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
