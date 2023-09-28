package com.example.parkinglot;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IParkingLot {

    String calculateFee(LocalDateTime entryDateTime, LocalDateTime exitDateTime);

}
