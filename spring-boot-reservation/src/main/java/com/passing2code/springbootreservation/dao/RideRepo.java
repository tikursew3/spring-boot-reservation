package com.passing2code.springbootreservation.dao;

import com.passing2code.springbootreservation.entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RideRepo extends JpaRepository<Ride, Long> {
}
