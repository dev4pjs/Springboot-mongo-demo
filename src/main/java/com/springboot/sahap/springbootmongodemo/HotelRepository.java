package com.springboot.sahap.springbootmongodemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel,String>{
}
