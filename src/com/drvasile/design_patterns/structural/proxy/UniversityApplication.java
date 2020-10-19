package com.drvasile.design_patterns.structural.proxy;

import com.drvasile.design_patterns.structural.proxy.abstractions.IAdmission;

public class UniversityApplication implements IAdmission {

    @Override
    public void applyToUniversity() {
        System.out.println("Application process completed!");
    }
}
