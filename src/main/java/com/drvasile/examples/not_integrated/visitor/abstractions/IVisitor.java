package com.drvasile.examples.not_integrated.visitor.abstractions;

import com.drvasile.examples.not_integrated.visitor.ElementA;
import com.drvasile.examples.not_integrated.visitor.ElementB;

public interface IVisitor {
    void performOperation(ElementA elementA);
    void performOperation(ElementB elementB);
}
