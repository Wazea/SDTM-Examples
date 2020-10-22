package com.drvasile.examples.design_patterns.creational.prototype;

public class PrototypeClient {

    public static void main(String[] args) {

        Prototype prototype0 = new Prototype();
        prototype0.setData(new String[] {"Abc", "Def"});

        Prototype prototype1 = prototype0.shallowClone();
    }
}
