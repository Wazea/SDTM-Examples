package com.drvasile.domain.models.structures;

import com.drvasile.domain.models.actors.Rector;
import com.drvasile.domain.models.structures.interfaces.IComplexEntity;
import com.drvasile.domain.models.structures.interfaces.IUniversityEntity;

public class University implements IUniversityEntity, IComplexEntity {

    private Rector rector;
    private Faculty[] faculties;

    @Override
    public void returnObjects() {

        System.out.println("University");

        rector.returnObject();

        for (Faculty faculty : faculties) {
            faculty.returnObjects();
        }
    }

    @Override
    public String toString() {
        return "University";
    }
}
