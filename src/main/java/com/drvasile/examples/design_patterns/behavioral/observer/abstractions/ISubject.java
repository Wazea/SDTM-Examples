package com.drvasile.examples.design_patterns.behavioral.observer.abstractions;

public interface ISubject {

    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
}
