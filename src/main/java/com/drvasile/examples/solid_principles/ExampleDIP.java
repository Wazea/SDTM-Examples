package com.drvasile.examples.solid_principles;

public class ExampleDIP {}

class BeforeDIP {

    // This is located in the first module
    class FirstClass {
        private SecondClass secondClass = new SecondClass();
    }

    // This is located in the second module
    class SecondClass {

    }
}


class AfterDIP {

    // This is located in the first module
    class FirstClass {
        private ISecond secondClass;
    }

    // This is located in the second module
    interface ISecond {

    }

    // This is located in the second module
    class SecondClass implements ISecond {

    }
}
