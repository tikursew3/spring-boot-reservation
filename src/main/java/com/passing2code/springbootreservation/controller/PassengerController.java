package com.passing2code.springbootreservation.controller;
/*
import com.passing2code.springbootreservation.dto.PassengerDto;
import com.passing2code.springbootreservation.dto.ReservedDto;
import com.passing2code.springbootreservation.entity.Passenger;
import com.passing2code.springbootreservation.entity.Ride;
import com.passing2code.springbootreservation.service.PassengerService;
import com.passing2code.springbootreservation.service.ReservedRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    //@Autowired
   // PassengerDto passengerDto;


    @PostMapping("/passengers")
    public ResponseEntity<?> getPassenger (@RequestBody PassengerDto passengerDto) {
        Passenger passenger = passengerService.getPassenger(passengerDto);
        if( passenger == null)
            return new ResponseEntity<>("Info is not collected ", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(passenger, HttpStatus.OK);

    }

}
*/
