package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "destination_address")
@Data
public class DestinationAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

    // join using primary key
    // by default key have same name
    @OneToOne
    @PrimaryKeyJoinColumn
    private Ride ride;
}
