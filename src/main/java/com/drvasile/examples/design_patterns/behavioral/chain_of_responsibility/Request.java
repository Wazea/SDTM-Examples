package com.drvasile.examples.design_patterns.behavioral.chain_of_responsibility;

public class Request {

    private String compatibleHandler;

    Request(String compatibleHandler) {
        this.compatibleHandler = compatibleHandler;
    }

    public String getCompatibleHandler() {
        return compatibleHandler;
    }

    public void setCompatibleHandler(String compatibleHandler) {
        this.compatibleHandler = compatibleHandler;
    }
}
