package com.drvasile.examples.not_integrated.observer.abstractions;

public interface ISubject {

    void attach(IObserver observer);
    void detach(IObserver observer);
    void notifyObservers();
}
