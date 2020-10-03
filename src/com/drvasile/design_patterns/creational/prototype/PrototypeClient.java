package com.drvasile.design_patterns.creational.prototype;

public class PrototypeClient {

    public static void main(String[] args) {

        Prototype prototype0 = new Prototype();
        prototype0.setSomeExpensiveToGetData(new String[] {"Abc", "Def"});

        Prototype prototype1 = prototype0.clone();

        // Shallow / Deep cloning
        System.out.println(prototype0.hashCode());
        System.out.println(prototype1.hashCode());
    }
}
