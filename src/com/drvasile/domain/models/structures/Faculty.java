package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.actors.Dean;
import com.drvasile.domain.models.actors.Rector;
import com.drvasile.domain.models.structures.interfaces.IComplexEntity;
import com.drvasile.domain.models.structures.interfaces.UniversityEntity;

public class Faculty extends UniversityEntity implements IComplexEntity {

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
        return "Faculty";
    }
}
