package com.musifyre.room_service.infrastructure.repository;

import com.musifyre.room_service.domain.RoomRepository;
import com.musifyre.room_service.domain.dto.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@Primary
@RequiredArgsConstructor
public class MongoDbRoomRepository implements RoomRepository {
    private final SpringDataMongoRoomRepository roomRepository;

    @Override
    public Optional<List<Room>> findAll() {
        return Optional.of(roomRepository.findAll());
    }

    @Override
    public Optional<Room> findById(final UUID id) {
        return roomRepository.findById(id);
    }

    @Override
    public void save(Room room) {
        roomRepository.save(room);
    }
}
