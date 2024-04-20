package com.example.getroomssolution.controllers;

import com.example.getroomssolution.dtos.GetRoomsRequestDto;
import com.example.getroomssolution.dtos.GetRoomsResponseDto;
import com.example.getroomssolution.dtos.ResponseStatus;
import com.example.getroomssolution.models.Room;
import com.example.getroomssolution.services.RoomService;

import java.util.List;

public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    public GetRoomsResponseDto getRooms(GetRoomsRequestDto requestDto) {
        GetRoomsResponseDto responseDto = new GetRoomsResponseDto();
        try {
            List<Room> rooms = roomService.getRooms(requestDto.getRoomType());
            responseDto.setRooms(rooms);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
