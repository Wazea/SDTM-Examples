package com.drvasile.examples.not_integrated.chain_of_responsibility;

import com.drvasile.examples.not_integrated.chain_of_responsibility.abstractions.Handler;

public class Handler1 extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("Visited Handler 1.");
        if (request.getCompatibleHandler().equals("Handler 1")) {
            System.out.println("Handler 1");
        } else {
            this.getSuccessor().handleRequest(request);
        }
    }
}
