package com.passing2code.springbootreservation.dto;

import com.passing2code.springbootreservation.entity.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@Data
public class ReservedDto {
    private Passenger passenger;
    private PickupAddress pickupAddress;
    private DestinationAddress destinationAddress;
    private PickupTime pickupTime;
    private ReservedRide reservedRide;
}
