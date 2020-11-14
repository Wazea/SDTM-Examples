package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.actors.administration.Dean;
import com.drvasile.domain.models.structures.abstractions.IComplexEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class Faculty extends UniversityEntity implements IComplexEntity {

    private String name;
    private Dean dean;
    private Department[] departments;

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public void traverseObject() {

        System.out.println(toString());

        dean.setLevel(this.getLevel() + 1);
        printWhiteSpaces(dean.getLevel());
        dean.traverseObject();

        for (Department department : departments) {
            department.setLevel(this.getLevel() + 1);
            printWhiteSpaces(department.getLevel());
            department.traverseObject();
        }
    }

    @Override
    public String toString() {
        return "Faculty: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
