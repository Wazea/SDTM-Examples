package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.actors.interfaces.IAdministration;
import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;
import com.drvasile.domain.models.structures.interfaces.ISimpleEntity;
import com.drvasile.domain.models.structures.interfaces.UniversityEntity;

import java.io.Serializable;

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
