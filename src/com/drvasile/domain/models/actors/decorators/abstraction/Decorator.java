package com.drvasile.domain.models.actors.decorators.abstraction;

public abstract class Decorator implements ILecturer {

    // Composition
    private ILecturer lecturer;

    public ILecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(ILecturer lecturer) {
        this.lecturer = lecturer;
    }

    public abstract void addTitle();
}
