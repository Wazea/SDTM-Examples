package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;
import com.drvasile.domain.models.structures.interfaces.ISimpleEntity;
import com.drvasile.domain.models.structures.interfaces.UniversityEntity;

public class Professor extends UniversityEntity implements IUniversityEmployee, ISimpleEntity {

    private int age;
    private boolean isPhd;
    private String name;
    private Student[] students;

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Professor";
    }
}
