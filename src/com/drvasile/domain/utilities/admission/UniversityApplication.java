package com.drvasile.domain.utilities.admission;

import com.drvasile.domain.utilities.admission.abstractions.IAdmission;

public class UniversityApplication implements IAdmission {

    @Override
    public void applyToUniversity() {
        System.out.println("Application process completed!");
    }
}
