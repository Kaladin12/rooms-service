package com.musifyre.room_service.domain;

import com.musifyre.room_service.domain.dto.Room;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RoomRepository {
    Optional<List<Room>> findAll();

    Optional<Room> findById(UUID id);

    void save(Room room);
}
