package com.drvasile.examples.design_patterns.structural.proxy;

import com.drvasile.domain.utilities.admission.UniversityApplicationProxy;
import com.drvasile.domain.utilities.admission.abstractions.IAdmission;

public class ProxyClient {

    public static void main(String[] args) {
        IAdmission admission = new UniversityApplicationProxy();
        admission.applyToUniversity();
    }
}
