package com.example.parkinglot;

import javafx.stage.Stage;

public class ParkingLotFactory {

    public IParkingLot createParkingLot(int option) {

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
