package com.passing2code.springbootreservation.service;

import com.passing2code.springbootreservation.dto.ReservedDto;
import com.passing2code.springbootreservation.entity.ReservedRide;


import java.util.List;


public interface ReservedRideService {
    ReservedRide reservedRide(ReservedDto reservedDto);
    public List<ReservedRide> getAllReservedRide();

    public  ReservedRide getReservedRideById(Long reservedId);

    public  ReservedRide deleteReservedRideById(Long reservedId);
    public List<ReservedRide> getAllReservedRideByPassengerId(Long reservedId);


}
