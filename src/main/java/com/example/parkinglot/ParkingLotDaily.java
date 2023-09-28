package com.example.parkinglot;

import java.time.LocalDateTime;

public class ParkingLotDaily implements IParkingLot {
    @Override
    public String calculateFee(LocalDateTime entryDateTime, LocalDateTime exitDateTime) {

        Ticket ticket = new Ticket();

        long[] duration = ticket.getDuration(entryDateTime, exitDateTime);

        long stayDays = duration[0];
        long stayHours = duration[1];
        long stayMinutes = duration[2];

        long parkingFee;

        if (((stayHours * 60) + stayMinutes) > 0) {
            stayDays += 1;
        }

        parkingFee = stayDays * 12;


        if (parkingFee < 0) {
            return "Entry date/time is after Exit date/time. Please check and try again";
        } else {
            return "$" + parkingFee;
        }
    }
}
