package com.drvasile.examples.command.abstractions;

import com.drvasile.examples.command.ConcreteReceiver1;

public interface ICommand {

    ConcreteReceiver1 receiver = new ConcreteReceiver1();
    void execute();
}
