package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.structures.interfaces.ISimpleEntity;
import com.drvasile.domain.models.structures.interfaces.UniversityEntity;

import java.io.Serializable;

public class Dean extends UniversityEntity implements ISimpleEntity {

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Dean";
    }
}