package com.drvasile.examples.command;

import com.drvasile.examples.command.abstractions.ICommand;

public class ConcreteCommand1 implements ICommand {

    @Override
    public void execute() {
        receiver.action1();
        receiver.setState(true);
    }
}
