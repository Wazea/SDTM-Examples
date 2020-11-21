package com.drvasile.examples.design_patterns.behavioral.visitor.abstractions;

public interface IElement {
    void accept(IVisitor visitor);
    void operation();
}
