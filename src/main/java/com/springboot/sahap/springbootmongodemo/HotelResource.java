package com.springboot.sahap.springbootmongodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelResource {
    private HotelRepository hotelRepository;

    public HotelResource(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAllHotels(){
        return this.hotelRepository.findAll();
    }
}
