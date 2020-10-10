package com.drvasile.design_patterns.structural.decorator;

import com.drvasile.design_patterns.structural.decorator.abstraction.ILecturer;

public class SimpleLecturer implements ILecturer {

    @Override
    public void haveLecture() {
        System.out.println("Have Lecture with a simple lecturer.");
    }
}
