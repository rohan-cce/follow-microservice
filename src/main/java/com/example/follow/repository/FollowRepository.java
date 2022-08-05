package com.example.follow.repository;

import com.example.follow.document.Follow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FollowRepository extends MongoRepository<Follow,Integer> {

    Follow save(Follow follow);
    Follow findById(String id);

}
