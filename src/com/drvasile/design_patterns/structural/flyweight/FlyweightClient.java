package com.drvasile.design_patterns.structural.flyweight;

import com.drvasile.domain.models.actors.Professor;

public class FlyweightClient {

    public static void main(String[] args) {
        Professor tmpsProfessor = ProfessorFactory.getProfessorInstance("tmps");
        Professor tmpsProfessor2 = ProfessorFactory.getProfessorInstance("tmps");
        Professor rcProfessor = ProfessorFactory.getProfessorInstance("rc");

        System.out.println(tmpsProfessor.hashCode());
        System.out.println(tmpsProfessor2.hashCode());
        System.out.println(rcProfessor.hashCode());
    }
}
