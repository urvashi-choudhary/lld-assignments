package com.example.getroomssolution.services;

import com.example.getroomssolution.models.Room;

import java.util.List;

public interface RoomService {
    List<Room> getRooms(String roomType);
}
