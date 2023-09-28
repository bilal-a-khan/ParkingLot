package com.example.parkinglot;

import javafx.application.Application;

import javafx.stage.Stage;

import java.io.IOException;

public class ParkingLotApp extends Application {

    private IParkingLot parkingLot = new ParkingLotDefault();
    private ParkingLotView view;
    private ParkingLotController controller;

    @Override
    public void start(Stage stage) throws IOException {

        view = new ParkingLotView(parkingLot);
        view.initializeLayout(stage);

        controller = new ParkingLotController(parkingLot,view);
    }

    public static void main(String[] args) {
        launch();
    }
}