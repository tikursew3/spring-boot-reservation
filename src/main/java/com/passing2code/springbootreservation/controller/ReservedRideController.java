package com.passing2code.springbootreservation.controller;


import com.passing2code.springbootreservation.dto.ReservedDto;
import com.passing2code.springbootreservation.entity.ReservedRide;
import com.passing2code.springbootreservation.service.ReservedRideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/*")
public class ReservedRideController {
    @Autowired
    private ReservedRideService reservedRideService;
    @PostMapping("/reserve")
    public ResponseEntity<?> placeReserve (@RequestBody ReservedDto reservedDto) {
        ReservedRide reservedRide = reservedRideService.reservedRide(reservedDto);
        if( reservedRide == null)
            return new ResponseEntity<>("Info is not collected ", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(reservedRide, HttpStatus.OK);
    }
    @GetMapping("/reserve")
    public  ResponseEntity<List<ReservedRide>> getAllRides() {
        return ResponseEntity.status(HttpStatus.OK).body(reservedRideService.getAllReservedRide()) ;
    }
    @GetMapping("/reserve/{id}")
    public ResponseEntity<ReservedRide> getRideById(@PathVariable Long id) {
        return  ResponseEntity.status(HttpStatus.OK).body(reservedRideService.getReservedRideById(id));
    }
    @GetMapping("/reserve/passenger/{passenger_id}")
    public ResponseEntity<List<ReservedRide>> getAllRidesByPassengerId(@PathVariable Long passenger_id){
        return ResponseEntity.status(HttpStatus.OK).body(reservedRideService.getAllReservedRideByPassengerId(passenger_id));
    }
    @DeleteMapping("/reserve/{reserved_id}")
    public ResponseEntity<ReservedRide> deleteRideById(@PathVariable Long reserved_id) {
        return  ResponseEntity.status(HttpStatus.OK).body(reservedRideService.deleteReservedRideById(reserved_id));
    }

}
