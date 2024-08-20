package com.musifyre.room_service.domain.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Builder
@Document(collection = "rooms")
public class Room {
    @Id
    private UUID id;
    private String name;
    private String description;
}
