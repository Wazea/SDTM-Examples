package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.structures.abstractions.IComplexEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class Department extends UniversityEntity implements IComplexEntity {

    private String name;
    private Professor[] professors;

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

    @Override
    public void traverseObject() {
        System.out.println(toString());

        for (Professor professor : professors) {
            professor.setLevel(this.getLevel() + 1);
            printWhiteSpaces(professor.getLevel());
            professor.traverseObject();
        }
    }

    @Override
    public String toString() {
        return "Department: " + this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
