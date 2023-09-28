package com.example.parkinglot;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ticket {

    public long[] getDuration(LocalDateTime entryDateTime, LocalDateTime exitDateTime) {

        long stayDays = entryDateTime.until(exitDateTime, ChronoUnit.DAYS);
        long stayHours = entryDateTime.until(exitDateTime, ChronoUnit.HOURS) - (stayDays * 24);
        long stayMinutes = entryDateTime.until(exitDateTime, ChronoUnit.MINUTES) - (stayDays * 1440) - (stayHours * 60);

        return new long[]{stayDays, stayHours, stayMinutes};

    }
}
