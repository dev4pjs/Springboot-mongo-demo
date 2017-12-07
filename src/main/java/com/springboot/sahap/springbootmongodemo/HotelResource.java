package com.springboot.sahap.springbootmongodemo;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public List<Hotel> addHotel(@RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
        return this.hotelRepository.findAll();
    }

    @PutMapping
    public List<Hotel> updateHotel(@RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
        return this.hotelRepository.findAll();
    }
    @DeleteMapping("/{id}")
    public List<Hotel> deleteHotel(@PathVariable("id") String id){
        this.hotelRepository.delete(id);
        return this.hotelRepository.findAll();
    }

    @GetMapping("/{id}")
    public Hotel getHotelbyId(@PathVariable("id") String id){
        return this.hotelRepository.findById(id);
    }
    @GetMapping("/pricegreaterthan/{minprice}")
    public List<Hotel> getHotelWithPriceGreaterThan(@PathVariable("minprice") int minprice){
        List<Hotel> hotels = this.hotelRepository.findByPricePerNightGreaterThan(minprice);
        return hotels;
    }

    @GetMapping("/pricelessthan/{maxprice}")
    public List<Hotel> getHotelWithPriceLessThan(@PathVariable("maxprice") int maxprice){
        List<Hotel> hotels = this.hotelRepository.findByPricePerNightLessThan(maxprice);
        return hotels;
    }


}
