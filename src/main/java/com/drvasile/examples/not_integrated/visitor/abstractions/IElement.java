package com.drvasile.examples.not_integrated.visitor.abstractions;

public interface IElement {
    void accept(IVisitor visitor);
    void operation();
}
