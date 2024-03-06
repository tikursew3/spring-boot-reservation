package com.passing2code.springbootreservation.service;

import com.passing2code.springbootreservation.dao.PassengerRepo;
import com.passing2code.springbootreservation.dto.ReserveDto;
import com.passing2code.springbootreservation.entity.Passenger;
import com.passing2code.springbootreservation.entity.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveServiceImpl implements ReserveService{

    private PassengerRepo passengerRepo;
    @Autowired
    public ReserveServiceImpl(PassengerRepo passengerRepo) {
        this.passengerRepo = passengerRepo;
    }
    @Override
    public Passenger reserve(ReserveDto reserveDto) {
        Ride ride = reserveDto.getRide();
        ride.setPassenger(reserveDto.getPassenger());
        ride.setDestinationAddress(reserveDto.getDestinationAddress());
        ride.setPickupAddress(reserveDto.getPickupAddress());
        ride.setPickupTime(reserveDto.getPickupTime());

        passengerRepo.save(ride.getPassenger());
        return ride.getPassenger();
    }
}
