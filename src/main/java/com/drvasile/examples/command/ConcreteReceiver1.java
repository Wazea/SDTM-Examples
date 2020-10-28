package com.drvasile.examples.command;

public class ConcreteReceiver1 {

    private Boolean state = false;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public void action1() {
        System.out.println("Perform action 1!");
    }

    public void action2() {
        System.out.println("Perform action 2!");
    }
}
