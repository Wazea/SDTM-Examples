package com.drvasile.examples.solid_principles;

public class ExampleOCP {}

/*
 * The class BeforeOCP gives an example of OCP not being obeyed.
 * In this case conditional statements are used to perform some specific behavior.
 */
class BeforeOCP {

    interface IClass {}

    static class ClassA implements IClass {
        void actionA() {
            System.out.println("ClassA: Method actionA()");
        }
    }

    static class ClassB implements IClass {
        void actionB() {
            System.out.println("ClassB: Method actionB()");
        }
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
 * The class AfterOCPDyPoly gives an example of OCP being obeyed by using dynamic polymorphism.
 * In this case inheritance is used at its full potential to achieve dynamic polymorphism with the subclasses that have
 * specific method declaration, but the same method signature.
 */
class AfterOCPDyPoly {

    interface IClass {
        void action();
    }

    static class ClassA implements IClass {
        @Override
        public void action() {
            System.out.println("ClassA: Method action()");
        }
    }

    static class ClassB implements IClass {
        @Override
        public void action() {
            System.out.println("ClassB: Method action()");
        }
    }

    public static void method(IClass object) {
        object.action();
    }

    public static void main(String[] args) {
        method(new ClassA());
        method(new ClassB());
    }
}

/*
 * The class AfterOCPStPoly gives an example of OCP being obeyed by using static polymorphism.
 */
class AfterOCPStPoly {

    static class ClassA {
        // Some fields and methods
    }

    static class ClassB {
        // Some fields and methods
    }

    public static <Type> void method(Type object) {
        System.out.println("An object of type " + object.getClass() + " was passed.");
    }

    public static void main(String[] args) {
        method(new ClassA());
        method(new ClassB());
    }
}



