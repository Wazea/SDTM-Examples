package com.drvasile.examples.not_integrated.command;

import com.drvasile.examples.not_integrated.command.abstractions.ICommand;

public class ConcreteCommand1 implements ICommand {

    @Override
    public void execute() {
        receiver.action1();
        receiver.setState(true);
    }
}
