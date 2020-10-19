package com.drvasile.domain.models.actors;

import com.drvasile.design_patterns.structural.decorator.abstraction.Decorator;
import com.drvasile.design_patterns.structural.decorator.abstraction.ILecturer;

public class AssociateProfessor extends Decorator {

    public AssociateProfessor(ILecturer lecturer) {
        this.setLecturer(lecturer);
    }

    @Override
    public void addTitle() {
        System.out.println("Add associatem professor title.");
    }

    @Override
    public void haveLecture() {
        addTitle();
        this.getLecturer().haveLecture();
        System.out.println("This lecturer is conf now.");
    }
}
