package com.drvasile.examples.design_patterns.behavioral.mediator.abstractions;

public interface IMediator {
    void addColleague(IColleague colleague);
    void removeColleague(IColleague colleague);
    void sendMessage(Integer senderId, String message);
}
