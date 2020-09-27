package com.drvasile.design_patterns.creational.singleton;

/*
 * This is a simple Singleton class.
 * It doesn't have any domain data.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {

        // Lazy initialization
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
