package com.drvasile.examples.design_patterns.behavioral.visitor.abstractions;

import com.drvasile.examples.design_patterns.behavioral.visitor.ElementA;
import com.drvasile.examples.design_patterns.behavioral.visitor.ElementB;

public interface IVisitor {
    void performOperation(ElementA elementA);
    void performOperation(ElementB elementB);
}
