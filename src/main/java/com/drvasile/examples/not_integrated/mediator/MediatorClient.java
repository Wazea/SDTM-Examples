package com.drvasile.examples.not_integrated.mediator;

import com.drvasile.examples.not_integrated.mediator.abstractions.IColleague;

import java.util.ArrayList;
import java.util.List;

public class MediatorClient {

    private static final GroupChat groupChat = GroupChat.getGroupChat();
    private static final List<IColleague> colleagues = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            IColleague newColleague = new ChatParticipant(i, groupChat);
            colleagues.add(newColleague);
        }

        colleagues.get(6).sendMessage("Hello!");
    }
}
