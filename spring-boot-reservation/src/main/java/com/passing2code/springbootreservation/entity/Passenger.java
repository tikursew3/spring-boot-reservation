package com.passing2code.springbootreservation.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "passenger")
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne(mappedBy = "passenger", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Ride ride;


}
