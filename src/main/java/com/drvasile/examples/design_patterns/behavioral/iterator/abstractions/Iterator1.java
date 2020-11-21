package com.drvasile.examples.design_patterns.behavioral.iterator.abstractions;

public interface Iterator1<E> {

    E first();
    E next();
    E currentItem();
    boolean isDone();
}
