package com.example.parkinglot;

import java.time.LocalDateTime;

public interface ParkingLot {

    String calculateFee(LocalDateTime entryDateTime, LocalDateTime exitDateTime);

}
