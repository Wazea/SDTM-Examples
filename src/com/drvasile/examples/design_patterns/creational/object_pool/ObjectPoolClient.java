package com.drvasile.examples.design_patterns.creational.object_pool;

import com.drvasile.domain.models.structures.Room;

public class ObjectPoolClient {

    /** Object Pooling example with university rooms
     *
     * In this example I'm assigning rooms for courses.
     * These are taken from a list and when the list ends
     * the program will need to reuse the existing ones
     * at the moment those are available.
     *
     * This can be useful for example when the timetables
     * are created and the rooms are distributed.
     * @param args
     */
    public static void main(String[] args) {

        // List of available rooms
        Room[] rooms = new Room[10];

        // Initialization of new rooms
        for (int i = 0; i < 10; i++) {
            rooms[i] = new Room("10" + i);
        }

        int currentRoom = 0;
        int count = 0; // Execution count

        // The timetable generation process
        while (true) {
            count++;
            if (count == 23) {
                break;
            }

            // Assign current room
            System.out.println("Room #" + rooms[currentRoom].getRoomID());
            currentRoom++;

            // Reaching the 11th room
            if (currentRoom == 10) {
                // Assign rooms for next class (after 1h30m + break)
                currentRoom = 0;
            }
        }
    }
}
