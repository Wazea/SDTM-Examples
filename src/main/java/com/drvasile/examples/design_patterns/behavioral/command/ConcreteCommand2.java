package com.drvasile.examples.design_patterns.behavioral.command;

import com.drvasile.examples.design_patterns.behavioral.command.abstractions.ICommand;

public class ConcreteCommand2 implements ICommand {

    @Override
    public void execute() {

        if (!receiver.getState()) {
            receiver.action1();
            receiver.setState(true);
        }

        receiver.action2();
    }
}
