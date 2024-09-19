package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="reserved_ride")
@Data
public class ReservedRide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserved_ride_id")
    private Long reservedRideId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passenger_id", referencedColumnName = "passenger_id")
    //@Column(name = "passenger_id")
    private Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "pickup_address_id", referencedColumnName = "pickup_address_id")
    private PickupAddress pickupAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "destination_address_id", referencedColumnName = "destination_address_id")
    private DestinationAddress destinationAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "pickup_time", referencedColumnName = "pickup_time_id")
    private PickupTime pickupTime;


}





