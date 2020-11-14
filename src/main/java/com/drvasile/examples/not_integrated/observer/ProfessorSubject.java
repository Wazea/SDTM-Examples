package com.drvasile.examples.not_integrated.observer;

import com.drvasile.examples.not_integrated.observer.abstractions.IObserver;
import com.drvasile.examples.not_integrated.observer.abstractions.ISubject;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ProfessorSubject implements ISubject {

    private Map<Integer, IObserver> studentMap = new HashMap<>();

    @Override
    public void attach(IObserver observer) {
        studentMap.put(observer.getId(), observer);
    }

    @Override
    public void detach(IObserver observer) {
        studentMap.remove(observer.getId());
    }

    @Override
    public void notifyObservers() {
        Locale locale = new Locale(Locale.US.getCountry());
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        numberFormat.setMaximumFractionDigits(2);
        for (IObserver observer : studentMap.values()) {
            ((StudentObserver) observer).setGrade(Double.parseDouble(numberFormat.format(Math.random() * 10.0)));
            observer.update();
        }
    }
}
