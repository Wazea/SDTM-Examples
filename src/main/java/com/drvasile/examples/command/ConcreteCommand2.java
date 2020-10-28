package com.drvasile.examples.command;

import com.drvasile.examples.command.abstractions.ICommand;

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
