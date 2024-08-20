package com.musifyre.room_service.infrastructure.configuration;

import com.musifyre.room_service.infrastructure.repository.SpringDataMongoRoomRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoRoomRepository.class)
public class MongoDbConfiguration {
}
