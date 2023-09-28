package com.example.parkinglot;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class Ticket {

    public long[] getDuration(LocalDateTime entryDateTime, LocalDateTime exitDateTime) {

        long stayDays = entryDateTime.until(exitDateTime, DAYS);
        long stayHours = entryDateTime.until(exitDateTime, HOURS) - (stayDays * 24);
        long stayMinutes = entryDateTime.until(exitDateTime, MINUTES) - (stayDays * 1440) - (stayHours * 60);

        return new long[]{stayDays, stayHours, stayMinutes};

    }
}
