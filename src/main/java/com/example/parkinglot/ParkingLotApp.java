package com.example.parkinglot;

import javafx.application.Application;

import javafx.stage.Stage;

import java.io.IOException;

public class ParkingLotApp extends Application {

    private ParkingLot parkingLot = new ParkingLotDefault();

    @Override
    public void start(Stage stage) throws IOException {

        ParkingLotView view = new ParkingLotView();
        view.initializeLayout(stage);

        new ParkingLotController(parkingLot, view);
    }

    public static void main(String[] args) {
        launch();
    }
}