package com.drvasile.examples.solid_principles;

/*
 * The class BeforeLSP gives an example of LSP not being obeyed.
 * In this case, in the derived class, there is a condition that makes the method different from the one defined in the base class.
 * Because of this, it cannot be said that the derived class is fully substitutable by the base class.
 * By substituting the derived class to its base class the user can get some unexpected behavior.
 */
public class ExampleLSP {

    static class User {
        private Base instance;

        public Base getInstance() {
            return instance;
        }

        public void setInstance(Base instance) {
            this.instance = instance;
        }

        public void useInstance() {
            instance.method();
        }
    }

    static class Base {
        String string;

        public void method() {
            System.out.println("Base Class method: " + string);
        }
    }

    static class Derived extends Base {
        public void method() {

            if (this.string.isBlank()) {
                System.out.println("The string is blank.");
                return;
            }

            System.out.println("Derived Class method." + string);
        }
    }

    public static void main(String[] args) {
        User user0 = new User();
        user0.setInstance(new Derived());
        user0.getInstance().string = "";
        user0.useInstance();

        User user1 = new User();
        user1.setInstance(new Base());
        user1.getInstance().string = "";
        user1.useInstance();
    }
}
