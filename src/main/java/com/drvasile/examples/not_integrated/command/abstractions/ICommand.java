package com.drvasile.examples.not_integrated.command.abstractions;

import com.drvasile.examples.not_integrated.command.ConcreteReceiver1;

public interface ICommand {

    ConcreteReceiver1 receiver = new ConcreteReceiver1();
    void execute();
}
