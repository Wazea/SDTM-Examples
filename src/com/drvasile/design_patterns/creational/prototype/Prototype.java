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
        String[] newArray = new String[this.getSomeExpensiveToGetData().length];

        for (int i = 0; i < this.getSomeExpensiveToGetData().length; i++) {
            newArray[i] = this.getSomeExpensiveToGetData()[i];
        }

        newObject.setSomeExpensiveToGetData(newArray);

        return newObject;
    }
}
