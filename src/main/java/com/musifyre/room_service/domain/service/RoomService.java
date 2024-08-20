package com.musifyre.room_service.domain.service;

import com.musifyre.room_service.domain.RoomRepository;
import com.musifyre.room_service.domain.dto.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public UUID createRoom(String name, String description) {
        Room newRoom = Room.builder().id(UUID.randomUUID()).name(name).description(description).build();
        roomRepository.save(newRoom);
        return newRoom.getId();
    }

        public List<Room> getAllRooms() {
            return roomRepository.findAll().orElse(null);
        }
}
