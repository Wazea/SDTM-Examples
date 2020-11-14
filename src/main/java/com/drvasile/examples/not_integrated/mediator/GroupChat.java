package com.drvasile.examples.not_integrated.mediator;

import com.drvasile.examples.not_integrated.mediator.abstractions.IColleague;
import com.drvasile.examples.not_integrated.mediator.abstractions.IMediator;

import java.util.HashMap;
import java.util.Map;

public class GroupChat implements IMediator {

    private static GroupChat groupChat = null;
    private static Map<Integer, IColleague> colleagues = new HashMap<>();

    private GroupChat() {}

    public static GroupChat getGroupChat() {
        if (groupChat == null) {
            synchronized (GroupChat.class) {
                if (groupChat == null) {
                    groupChat = new GroupChat();
                }
            }
        }

        return groupChat;
    }

    @Override
    public void addColleague(IColleague colleague) {
        colleagues.put(colleague.getId(), colleague);
    }

    @Override
    public void removeColleague(IColleague colleague) {
        colleagues.remove(colleague.getId());
    }

    @Override
    public void sendMessage(Integer senderId, String message) {

        // Encryption
        // Pre-processing of the message

        for (IColleague colleague : colleagues.values()) {
            if (!senderId.equals(colleague.getId())) {
                colleague.receiveMessage(senderId, message);
            }
        }
    }
}
