package com.springboot.sahap.springbootmongodemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class PrePolulator implements CommandLineRunner {


    private HotelRepository hotelRepository;

    public PrePolulator(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Hotel marriot = new Hotel(
                "Marriot", 120,
                new Address("Paris", "Franch"),
                Arrays.asList(new Review("john", 9, false),
                        new Review("Purujit",8,true))

        );
        Hotel Hyaat = new Hotel(
                "Hyaat", 190,
                new Address("New York", "USA"),
                Arrays.asList(new Review("Ravi Kumar", 8, true))

        );
        Hotel Taj = new Hotel(
                "Taj", 230,
                new Address("Delhi", "India"),
                Arrays.asList(new Review("Cyndy", 8, true),
                        new Review("ArunKumar",9,true))

        );


        List<Hotel> listOfHotels = Arrays.asList(marriot,Hyaat,Taj);

        this.hotelRepository.save(listOfHotels);


    }
}
