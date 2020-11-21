package com.drvasile.examples.design_patterns.behavioral.command;

import com.drvasile.examples.design_patterns.behavioral.command.abstractions.ICommand;

public class ConcreteCommand1 implements ICommand {

    @Override
    public void execute() {
        receiver.action1();
        receiver.setState(true);
    }
}
