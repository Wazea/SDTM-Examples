package com.drvasile.examples.design_patterns.behavioral.chain_of_responsibility;

import com.drvasile.examples.design_patterns.behavioral.chain_of_responsibility.abstractions.Handler;

public class Handler2 extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getCompatibleHandler().equals("Handler 2")) {
            System.out.println("Handler 2");
        } else {
            System.out.println("Cannot be handled!");
        }
    }
}
