package com.drvasile.examples.not_integrated.mediator.abstractions;

public interface IColleague {
    Integer getId();
    void setId(Integer id);
    IMediator getMediator();
    void setMediator(IMediator mediator);
    void sendMessage(String message);
    void receiveMessage(Integer senderId, String message);
}
