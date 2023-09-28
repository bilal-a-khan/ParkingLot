package com.example.parkinglot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ParkingLotApp extends Application {

    private ParkingLot parkingLot = new ParkingLot();

    @Override
    public void start(Stage stage) throws IOException {

        ParkingLotView view = new ParkingLotView(parkingLot);
        view.initializeLayout(stage);

    }

    public static void main(String[] args) {
        launch();
    }
}