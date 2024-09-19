package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@Entity
@Table(name = "pickup_time")
@Data
public class PickupTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pickup_time_id")
    private Long pickupTimeId;


    @Column(name = "pickup_date")
    @CreationTimestamp
    private Date pickupDate;

    @Column(name = "pickup_hour")
    @CreationTimestamp
    private Date pickupHour;

    //@OneToOne
   // @PrimaryKeyJoinColumn
    //private Ride ride;

}