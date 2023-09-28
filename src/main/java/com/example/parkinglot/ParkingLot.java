package com.example.parkinglot;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ParkingLot {

    public long getFee(long[] duration) {

        long parkingFee;
        long hourFee;
        long dayFee;

        long stayDays = duration[0];
        long stayHours = duration[1];
        long stayMinutes = duration[2];

        if (stayDays == 0 && stayHours == 0 && stayMinutes < 30) {
            parkingFee = 0;
        } else {
            dayFee = stayDays * 15;
            if (stayMinutes > 0) {
                stayHours += 1;
            }
            if (stayHours > 7)
                hourFee = 15;
            else {
                hourFee = stayHours * 2;
            }
            parkingFee = dayFee + hourFee;
        }
        return parkingFee;
    }
}
