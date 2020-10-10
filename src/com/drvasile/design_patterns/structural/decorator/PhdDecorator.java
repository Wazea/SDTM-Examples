package com.drvasile.design_patterns.structural.decorator;

import com.drvasile.design_patterns.structural.decorator.abstraction.Decorator;
import com.drvasile.design_patterns.structural.decorator.abstraction.ILecturer;

public class PhdDecorator extends Decorator {

    // Wrap the ILecturer instance
    public PhdDecorator(ILecturer lecturer) {
        this.setLecturer(lecturer);
    }

    @Override
    public void addTitle() {
        System.out.println("Add Phd title to a lecturer");
    }

    @Override
    public void haveLecture() {
        addTitle();
        this.getLecturer().haveLecture();
        System.out.println("This lecturer is a phd now.");
    }
}
