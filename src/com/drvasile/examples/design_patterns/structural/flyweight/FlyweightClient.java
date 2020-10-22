package com.drvasile.examples.design_patterns.structural.flyweight;

import com.drvasile.domain.data_structures.ProfessorRegistry;
import com.drvasile.domain.models.actors.teaching.Professor;

public class FlyweightClient {

    public static void main(String[] args) {
        Professor tmpsProfessor = ProfessorRegistry.getProfessorInstance("tmps");
        Professor tmpsProfessor2 = ProfessorRegistry.getProfessorInstance("tmps");
        Professor rcProfessor = ProfessorRegistry.getProfessorInstance("rc");

        System.out.println(tmpsProfessor.hashCode());
        System.out.println(tmpsProfessor2.hashCode());
        System.out.println(rcProfessor.hashCode());
    }
}
