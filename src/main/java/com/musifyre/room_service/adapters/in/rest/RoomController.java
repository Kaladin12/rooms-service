package com.musifyre.room_service.adapters.in.rest;

import com.musifyre.room_service.domain.dto.CreateRoomRequest;
import com.musifyre.room_service.domain.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.UUID;

@RestController()
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "")
    ResponseEntity<Map<String, String>> getRooms() {
        return ResponseEntity.ok(Map.of("hello", "world"));
    }

    @PostMapping()
    ResponseEntity<Map<String, String>> createRoom(@RequestBody CreateRoomRequest room) throws URISyntaxException {
        UUID id = roomService.createRoom(room.getName(), room.getDescription());
        return ResponseEntity.created(new URI("/rooms/" + id)).body(Map.of("id", id.toString()));
    }
}
