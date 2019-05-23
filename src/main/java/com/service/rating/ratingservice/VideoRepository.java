package com.service.rating.ratingservice;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {
    Video findBy_id(ObjectId _id);
}
