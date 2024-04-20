package com.example.getroomssolution.repositories;

import com.example.getroomssolution.models.Room;
import com.example.getroomssolution.models.RoomType;

import java.util.List;

public interface RoomRepository {
    Room add(Room room);
    List<Room> getRooms();
    List<Room> getRoomsByRoomType(RoomType roomType);
    Room save(Room room);
}
