package com.drvasile.examples.design_patterns.structural.bridge.bridge_example;

public class Client1 {

    public static void main(String[] args) {
        Abstraction1 abstraction1 = new Concrete11();
        abstraction1.abstraction2List.add(new Concrete21());
        abstraction1.abstraction2List.add(new Concrete21());

        System.out.println(abstraction1.abstraction2List.size());
    }
}
