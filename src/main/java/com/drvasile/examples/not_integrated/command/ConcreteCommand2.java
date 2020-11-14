package com.drvasile.examples.not_integrated.command;

import com.drvasile.examples.not_integrated.command.abstractions.ICommand;

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
