package com.passing2code.springbootreservation.dto;

import com.passing2code.springbootreservation.entity.*;
import lombok.Data;

@Data
public class ReserveDto {
    private Passenger passenger;
    private PickupAddress pickupAddress;
    private DestinationAddress destinationAddress;
    private PickupTime pickupTime;
    private Ride ride;
}
