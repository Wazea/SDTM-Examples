package com.drvasile.examples.design_patterns.behavioral.chain_of_responsibility.abstractions;

import com.drvasile.examples.design_patterns.behavioral.chain_of_responsibility.Request;

public abstract class Handler {

    private Handler successor;

    public abstract void handleRequest(Request request);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
