package com.drvasile.design_patterns.structural.proxy;

import com.drvasile.design_patterns.structural.proxy.abstractions.IAdmission;

public class ProxyClient {

    public static void main(String[] args) {
        IAdmission admission = new UniversityApplicationProxy();
        admission.applyToUniversity();
    }
}
