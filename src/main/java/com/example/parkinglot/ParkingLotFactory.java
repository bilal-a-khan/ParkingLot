package com.example.parkinglot;

public class ParkingLotFactory {

    public static ParkingLot createParkingLot(int option) {

        switch (option) {
            case 1 -> {
                return new ParkingLotDaily();
            }
            case 2 -> {
                return new ParkingLotLongTerm();
            }
            default -> {
                return new ParkingLotDefault();
            }
        }
    }
}
