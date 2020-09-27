package com.drvasile.design_patterns.creational.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton singleton0 = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton0.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
