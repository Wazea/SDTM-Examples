package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.actors.administration.Rector;
import com.drvasile.domain.models.structures.abstractions.IComplexEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class University extends UniversityEntity implements IComplexEntity {

    private Rector rector;
    private Faculty[] faculties;

    public Rector getRector() {
        return rector;
    }

    public void setRector(Rector rector) {
        this.rector = rector;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public void setFaculties(Faculty[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public void traverseObject() {

        System.out.println(toString());

        rector.setLevel(this.getLevel() + 1);
        printWhiteSpaces(rector.getLevel());
        rector.traverseObject();

        for (Faculty faculty : faculties) {
            faculty.setLevel(this.getLevel() + 1);
            printWhiteSpaces(faculty.getLevel());
            faculty.traverseObject();
        }
    }

    @Override
    public String toString() {
        return "University";
    }
}
