package com.drvasile.domain.models.actors;

import com.drvasile.domain.models.actors.interfaces.IUniversityEmployee;
import com.drvasile.domain.models.structures.interfaces.SimpleEntity;

public class Professor implements IUniversityEmployee, SimpleEntity {

    private int age;
    private boolean isPhd;
    private String name;
    private Student[] students;

    @Override
    public String returnObject() {
        return toString();
    }

    @Override
    public String toString() {
        return "Professor";
    }
}
