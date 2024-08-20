package com.musifyre.room_service.domain.dto;

import lombok.Data;

@Data
public class CreateRoomRequest {
    private String name;
    private String description;
}
