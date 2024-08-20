package com.musifyre.room_service.infrastructure.repository;

import com.musifyre.room_service.domain.dto.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoRoomRepository extends MongoRepository<Room, UUID> {
}
