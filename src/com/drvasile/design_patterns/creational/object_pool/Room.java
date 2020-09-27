package com.drvasile.design_patterns.creational.object_pool;

public class Room {

    private String roomID;

    public Room(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
