package com.drvasile.domain.models.actors.decorators;

import com.drvasile.domain.models.actors.decorators.abstraction.ILecturer;

public class SimpleLecturer implements ILecturer {

    @Override
    public void haveLecture() {
        System.out.println("Have Lecture with a simple lecturer.");
    }
}
