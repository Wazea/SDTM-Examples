package com.drvasile.examples.command;

import com.drvasile.examples.command.abstractions.IInvoker;

public class ConcreteInvoker implements IInvoker {

    public static final ConcreteCommand1 concreteCommand1 = new ConcreteCommand1();
    public static final ConcreteCommand2 concreteCommand2 = new ConcreteCommand2();
}
