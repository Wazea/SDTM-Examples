package com.drvasile.examples.not_integrated.iterator.abstractions;

public interface Iterator1<E> {

    E first();
    E next();
    E currentItem();
    boolean isDone();
}
