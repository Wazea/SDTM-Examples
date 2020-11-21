package com.drvasile.examples.design_patterns.behavioral.observer.abstractions;

public interface IObserver {

    Integer getId();
    void setId(Integer id);
    void update();
}
