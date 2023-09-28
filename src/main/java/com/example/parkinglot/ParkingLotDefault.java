package com.example.parkinglot;

import java.time.LocalDateTime;

public class ParkingLotDefault implements IParkingLot {

    @Override
    public String calculateFee(LocalDateTime entryDateTime, LocalDateTime exitDateTime) {

        Ticket ticket = new Ticket();

        long[] duration = ticket.getDuration(entryDateTime, exitDateTime);

        long stayDays = duration[0];
        long stayHours = duration[1];
        long stayMinutes = duration[2];

        long parkingFee;
        long hourFee;
        long dayFee;

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

        if (parkingFee < 0) {
            return "Entry date/time is after Exit date/time. Please check and try again";
        } else {
            return "$" + parkingFee;
        }
    }
}
