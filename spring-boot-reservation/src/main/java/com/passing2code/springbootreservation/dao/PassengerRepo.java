package com.passing2code.springbootreservation.dao;

import com.passing2code.springbootreservation.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PassengerRepo extends JpaRepository<Passenger, Long> {
}
