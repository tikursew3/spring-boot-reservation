package com.passing2code.springbootreservation.service;

import com.passing2code.springbootreservation.dto.ReserveDto;
import com.passing2code.springbootreservation.entity.Passenger;

public interface ReserveService {
    Passenger reserve(ReserveDto reserveDto);
}
