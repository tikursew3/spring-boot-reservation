package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ride")
@Data
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passenger_id", referencedColumnName = "id")
    private Passenger passenger;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickup_address_id", referencedColumnName = "id")
    private PickupAddress pickupAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "destination_address_id", referencedColumnName = "id")
    private DestinationAddress destinationAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickup_time_id", referencedColumnName = "id")
    private PickupTime pickupTime;


}
