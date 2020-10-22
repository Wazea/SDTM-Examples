package com.drvasile.examples.design_patterns.creational.prototype;

public class Prototype {

    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    public Prototype shallowClone() {
        return this;
    }

    public Prototype shallowDataClone() {

        Prototype newObject = new Prototype();
        newObject.setData(this.getData());

        return newObject;
    }

    public Prototype deepClone() {

        Prototype newObject = new Prototype();
        String[] newArray = new String[this.getData().length];

        for (int i = 0; i < this.getData().length; i++) {
            newArray[i] = this.getData()[i];
        }

        newObject.setData(newArray);

        return newObject;
    }
}
