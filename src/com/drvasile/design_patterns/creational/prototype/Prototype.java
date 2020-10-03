package com.drvasile.design_patterns.creational.prototype;

public class Prototype {

    private String[] someExpensiveToGetData;


    public String[] getSomeExpensiveToGetData() {
        return someExpensiveToGetData;
    }

    public void setSomeExpensiveToGetData(String[] someExpensiveToGetData) {
        this.someExpensiveToGetData = someExpensiveToGetData;
    }

    public Prototype clone() {
        Prototype newObject = new Prototype();
        newObject.setSomeExpensiveToGetData(this.getSomeExpensiveToGetData());

        return newObject;
    }
}
