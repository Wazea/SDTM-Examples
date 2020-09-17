package com.drvasile;

import com.drvasile.domain.Factory;
import com.drvasile.domain.models.Professor;

public class Main {

    private static final Factory factory = Factory.getFactoryInstance();

    public static void main(String[] args) {
        Professor professor1 = (Professor) factory.getPrototype("Professor");
        professor1.setName("Ion");
        Professor professor2 = (Professor) factory.getPrototype("Professor");
        System.out.println(professor1.hashCode());
        System.out.println(professor2.hashCode());
    }
}
