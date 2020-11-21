package com.drvasile.examples.design_patterns.behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {

        ProfessorSubject subject = new ProfessorSubject();
        StudentObserver studentObserver0 = new StudentObserver(0);
        StudentObserver studentObserver1 = new StudentObserver(1);
        StudentObserver studentObserver2 = new StudentObserver(2);

        subject.attach(studentObserver0);
        subject.attach(studentObserver1);
        subject.attach(studentObserver2);

        subject.notifyObservers();
        System.out.println();

        subject.detach(studentObserver1);

        subject.notifyObservers();
    }
}
