package com.drvasile.design_patterns.structural.decorator;

import com.drvasile.design_patterns.structural.decorator.abstraction.Decorator;
import com.drvasile.design_patterns.structural.decorator.abstraction.ILecturer;

public class ConfDecorator extends Decorator {

    public ConfDecorator(ILecturer lecturer) {
        this.setLecturer(lecturer);
    }

    @Override
    public void addTitle() {
        System.out.println("Add Conf title.");
    }

    @Override
    public void haveLecture() {
        addTitle();
        this.getLecturer().haveLecture();
        System.out.println("This lecturer is conf now.");
    }
}
