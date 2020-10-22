package com.drvasile.domain.models.actors.teaching;

import com.drvasile.domain.models.actors.decorators.abstraction.Decorator;
import com.drvasile.domain.models.actors.decorators.abstraction.ILecturer;

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
