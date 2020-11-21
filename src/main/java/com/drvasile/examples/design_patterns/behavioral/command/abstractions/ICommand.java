package com.drvasile.examples.design_patterns.behavioral.command.abstractions;

import com.drvasile.examples.design_patterns.behavioral.command.ConcreteReceiver1;

public interface ICommand {

    ConcreteReceiver1 receiver = new ConcreteReceiver1();
    void execute();
}
