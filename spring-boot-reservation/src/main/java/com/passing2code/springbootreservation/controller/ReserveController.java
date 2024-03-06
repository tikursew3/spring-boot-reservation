package com.passing2code.springbootreservation.controller;

import com.passing2code.springbootreservation.dto.ReserveDto;
import com.passing2code.springbootreservation.entity.Passenger;
import com.passing2code.springbootreservation.service.ReserveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class ReserveController {
    private ReserveService reserveService;

    /*
    @PostMapping("/reserve")
    public Passenger reserve(@RequestBody Reserve reserve) {
        Passenger passenger = reserveService.reserve(reserve);
        return passenger;
    }
    */

    @PostMapping("/reserve")
    public ResponseEntity<?> placeReserve (@RequestBody ReserveDto reserveDto) {
        Passenger passenger = reserveService.reserve(reserveDto);
        if( passenger == null)
            return new ResponseEntity<>("Info is not collected ", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(passenger, HttpStatus.OK);
    }
}
