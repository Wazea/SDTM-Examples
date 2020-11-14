package com.drvasile.examples.not_integrated.mediator.abstractions;

public interface IMediator {
    void addColleague(IColleague colleague);
    void removeColleague(IColleague colleague);
    void sendMessage(Integer senderId, String message);
}
