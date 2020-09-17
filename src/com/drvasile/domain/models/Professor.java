package com.drvasile.domain.models;

import com.drvasile.domain.models.interfaces.IUniversityEmployee;

public class Professor implements IUniversityEmployee, Cloneable {

    private int age;
    private boolean isPhd;
    private String name;
    private Student[] students;
}
