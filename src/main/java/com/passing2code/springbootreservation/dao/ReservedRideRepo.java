package com.passing2code.springbootreservation.dao;

import com.passing2code.springbootreservation.entity.ReservedRide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservedRideRepo  extends JpaRepository<ReservedRide, Long> {
}
