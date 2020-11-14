package com.drvasile.examples.not_integrated.mediator;

import com.drvasile.examples.not_integrated.mediator.abstractions.IColleague;
import com.drvasile.examples.not_integrated.mediator.abstractions.IMediator;

public class ChatParticipant implements IColleague {

    private IMediator mediator;
    private Integer id;

    ChatParticipant(Integer id, IMediator mediator) {
        this.id = id;
        this.mediator = mediator;
        this.mediator.addColleague(this);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public IMediator getMediator() {
        return this.mediator;
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        this.mediator.sendMessage(this.id, message);
    }

    @Override
    public void receiveMessage(Integer senderId, String message) {
        System.out.println("Participant: " + this.id);
        System.out.println("Sender with id: " + senderId);
        System.out.println("Message: " + message);
        System.out.println();
    }
}
