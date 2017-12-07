package com.springboot.sahap.springbootmongodemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface HotelRepository extends MongoRepository<Hotel,String>{
    public Hotel findById(String id);
    public List<Hotel> findByPricePerNightLessThan(int maxprice);
    public List<Hotel> findByPricePerNightGreaterThan(int minPrice);

    @Query(value = "{address.city:?0}")
    public List<Hotel> findByCity(String city);
}
