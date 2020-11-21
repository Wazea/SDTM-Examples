package com.drvasile.examples.not_integrated.visitor;

import com.drvasile.examples.not_integrated.visitor.abstractions.IVisitor;

// Compute teaching hours
public class VisitorA implements IVisitor {

    @Override
    public void performOperation(ElementA elementA) {
        // Implementation for Professor object
        double teachingHours = (elementA.getCourseNum() * 1.5) + (elementA.getSeminarNum() * 1.5) + (elementA.getLabNum() * 1.5);

        System.out.println("The working hours for this professor: " + teachingHours);
    }

    @Override
    public void performOperation(ElementB elementB) {
        // Implementation for University Assistant object
        double teachingHours = (elementB.getSeminarNum() * 1.5) + (elementB.getLabNum() * 1.5);

        System.out.println("The working hours for this professor: " + teachingHours);
    }
}
