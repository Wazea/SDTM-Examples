package com.drvasile.examples.not_integrated.chain_of_responsibility;

import com.drvasile.examples.not_integrated.chain_of_responsibility.abstractions.Handler;

public class CoRClient {

    public static void main(String[] args) {
        Request newRequest = new Request("Handler 2");
        Handler handler1 = new Handler1();
        Handler handler2 = new Handler2();

        handler1.setSuccessor(handler2);

        handler1.handleRequest(newRequest);
    }
}
