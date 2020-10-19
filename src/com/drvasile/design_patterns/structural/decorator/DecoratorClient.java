package com.drvasile.design_patterns.structural.decorator;

import com.drvasile.design_patterns.structural.decorator.abstraction.ILecturer;
import com.drvasile.domain.models.actors.AssociateProfessor;

public class DecoratorClient {

    // Professor
    // Phd Professor
    // University Lecturer
    public static void main(String[] args) {

        // Simple lecturer
        ILecturer simpleLecturer = new SimpleLecturer();
        simpleLecturer.haveLecture();

        System.out.println();

        // Decorate with Phd title
        ILecturer phdLecturer = new PhdDecorator(simpleLecturer);
        phdLecturer.haveLecture();

        System.out.println();

        // Decorate with Conf title
        // ILecturer confLecturer = new ConfDecorator(new PhdDecorator(new SimpleLecturer()));
        ILecturer confLecturer = new AssociateProfessor(phdLecturer);
        confLecturer.haveLecture();
    }
}
