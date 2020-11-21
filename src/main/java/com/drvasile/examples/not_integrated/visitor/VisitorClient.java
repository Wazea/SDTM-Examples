package com.drvasile.examples.not_integrated.visitor;

import com.drvasile.examples.not_integrated.visitor.abstractions.IElement;
import com.drvasile.examples.not_integrated.visitor.abstractions.IVisitor;

public class VisitorClient {

    public static void main(String[] args) {
        IElement professor1 = new ElementA(3, 4, 5);
        IElement professor2 = new ElementA(2, 2, 2);
        IElement uniAssistant = new ElementB(4, 4);
        IVisitor teachingHours = new VisitorA();

        professor1.accept(teachingHours);
        professor2.accept(teachingHours);
        uniAssistant.accept(teachingHours);

        professor1.operation();
    }
}
