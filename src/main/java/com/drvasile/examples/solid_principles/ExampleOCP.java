package com.drvasile.examples.solid_principles;

public class ExampleOCP {}

/*
 * The class BeforeOCP gives an example of OCP not being obeyed.
 * In this case conditional statements are used to perform some specific behavior.
 */
class BeforeOCP {

    interface IClass {}

    static class ClassA implements IClass {
        void actionA() {}
    }

    static class ClassB implements IClass {
        void actionB() {}
    }

    public static void method(IClass object) {
        if (object.getClass() == ClassA.class) {
            ((ClassA) object).actionA();
        } else
        if (object .getClass() == ClassB.class) {
            ((ClassB) object).actionB();
        } else {
            System.out.println("Class not recognized.");
        }
    }

    public static void main(String[] args) {
        method(new ClassA());
        method(new ClassB());
        // Adding a new type of a class requires modifications
        // Thus, it does not obey the OCP
    }
}

/*
 * The class AfterOCP gives an example of OCP being obeyed.
 * In this case .
 */
class AfterOCP {

    interface IClass {
        void action();
    }

    static class ClassA implements IClass {
        @Override
        public void action() {
            // ClassA specific behavior
        }
    }

    static class ClassB implements IClass {
        @Override
        public void action() {
            // ClassB specific behavior
        }
    }

    private Integer type;

    public static void method(IClass object) {
        object.action();
    }

    public static void main(String[] args) {
        method(new ClassA());
        method(new ClassB());
    }
}


