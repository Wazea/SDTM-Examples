package com.drvasile.examples.solid_principles;

public class ExampleOCP {}

/*
 * The class BeforeOCP gives an example of OCP not being obeyed.
 * In this case, the class has the responsibility of data representation and also of data persistence.
 */
class BeforeOCP {

    private Integer type;

    public void method() {
        
    }
}
