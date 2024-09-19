package com.passing2code.springbootreservation.service;

import com.passing2code.springbootreservation.dao.ReservedRideRepo;
import com.passing2code.springbootreservation.dto.ReservedDto;
import com.passing2code.springbootreservation.entity.ReservedRide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ReservedRideServiceImpl implements ReservedRideService {

   // @Autowired
   // private PassengerRepo passengerRepo;
    @Autowired
    private ReservedRideRepo reservedRideRepo;
    @Autowired
    public ReservedRideServiceImpl(ReservedRideRepo reservedRideRepo) {
        this.reservedRideRepo = reservedRideRepo;
    }
    @Override
    public ReservedRide reservedRide(ReservedDto reservedDto) {
        ReservedRide reservedRide = new ReservedRide();

        reservedRide.setPassenger(reservedDto.getPassenger());
        reservedRide.setPickupAddress(reservedDto.getPickupAddress());
        reservedRide.setDestinationAddress(reservedDto.getDestinationAddress());
        reservedRide.setPickupTime(reservedDto.getPickupTime());


        reservedRideRepo.save(reservedRide);
        //passengerRepo.save(ride.getPassenger());
        return reservedRide;
    }

    @Override
    public List<ReservedRide> getAllReservedRide() {
        return reservedRideRepo.findAll();
    }

    @Override
    public ReservedRide getReservedRideById(Long id) {
        Optional<ReservedRide> optionalRide = reservedRideRepo.findById(id);
        if (optionalRide.isPresent()) {
            return optionalRide.get();
        } else {
            return null;
        }

    }

    @Override
    public ReservedRide deleteReservedRideById(Long reservedId) {
        Optional<ReservedRide> optionalRide = reservedRideRepo.findById(reservedId);
        if(optionalRide.isPresent()) {
            ReservedRide reservedRide = optionalRide.get();
            reservedRideRepo.deleteById(reservedId);
            return reservedRide;
        }
        return null;
    }

    @Override
    public List<ReservedRide> getAllReservedRideByPassengerId(Long reservedId) {
        List<ReservedRide> reservedRides = new ArrayList<>();
        for(ReservedRide reservedRide : reservedRideRepo.findAll()) {
            if(reservedRide.getPassenger().getPassengerId() == reservedId) {
                reservedRides.add(reservedRide);
            }
        }

        return  reservedRides;
    }
}
