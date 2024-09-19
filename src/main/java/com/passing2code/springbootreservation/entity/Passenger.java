package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;


@Entity
@Table(name ="passenger")
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Long passengerId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

   // @OneToOne
   // @PrimaryKeyJoinColumn
    //private Ride ride;

   // @Column(name = "pickupAddress")
   // private PickupAddress pickupAddress;

   // @Column(name = "destinationAddress")
  //  private PickupAddress destinationAddress;

  //  @Column(name = "pickupTime")
    // private PickupTime pickupTime;

}
