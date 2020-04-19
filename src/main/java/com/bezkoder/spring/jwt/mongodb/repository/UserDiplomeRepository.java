package com.bezkoder.spring.jwt.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.jwt.mongodb.models.UserDiplome;

public interface UserDiplomeRepository extends MongoRepository<UserDiplome, String>{

}
