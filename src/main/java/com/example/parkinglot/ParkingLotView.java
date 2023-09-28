package com.example.parkinglot;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ParkingLotView {

    private ParkingLot parkingLot;

    private Text appInfo;

    private Label entryDateLabel;
    private DatePicker entryDatePicker;
    private Label exitDateLabel;
    private DatePicker exitDatePicker;

    private Label entryTimeLabel;
    private TextField entryHourTextField;
    private TextField entryMinuteTextField;

    private Label exitTimeLabel;
    private TextField exitHourTextField;
    private TextField exitMinuteTextField;

    private Label hourLabel1;
    private Label minuteLabel1;
    private Label hourLabel2;
    private Label minuteLabel2;

    private Button getFeeButton;

    private Label feeLabel;

    public ParkingLotView(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
        initializeUIElements();
    }

    private void initializeUIElements() {
        // Create UI Elements
        appInfo = new Text("Please enter your Entry/Exit Dates & Time.\nPress the Get Fee button to find out the cost for parking.");

        entryDateLabel = new Label("Entry Date:");
        entryDatePicker = new DatePicker(LocalDate.now());

        entryTimeLabel = new Label("Entry Time:");
        entryHourTextField = new TextField(Integer.toString(LocalDateTime.now().getHour()));
        entryMinuteTextField = new TextField(Integer.toString(LocalDateTime.now().getMinute()));

        exitDateLabel = new Label("Exit Date:");
        exitDatePicker = new DatePicker(LocalDate.now());

        exitTimeLabel = new Label("Exit Time");
        exitHourTextField = new TextField(Integer.toString(LocalDateTime.now().getHour()));
        exitMinuteTextField = new TextField(Integer.toString(LocalDateTime.now().getMinute()));

        hourLabel1 = new Label("Hour (0-23)");
        minuteLabel1 = new Label("Minute (0-59)");
        hourLabel2 = new Label("Hour (0-23)");
        minuteLabel2 = new Label("Minute (0-59)");

        getFeeButton = new Button("Get Fee");

        feeLabel = new Label();

    }

    public void initializeLayout(Stage stage) {
        //Set up layout

        HBox entryDateHBox = new HBox(10, entryDateLabel,entryDatePicker);
        VBox entryHourVBox = new VBox(10,hourLabel1, entryHourTextField);
        VBox entryMinuteVBox = new VBox(10,minuteLabel1, entryMinuteTextField);
        HBox entryTimeHBox = new HBox(10, entryTimeLabel,entryHourVBox,entryMinuteVBox);

        HBox exitDateHBox = new HBox(10, exitDateLabel,exitDatePicker);
        VBox exitHourVBox = new VBox(10,hourLabel2, exitHourTextField);
        VBox exitMinuteVBox = new VBox(10,minuteLabel2, exitMinuteTextField);
        HBox exitTimeHBox = new HBox(10, exitTimeLabel,exitHourVBox,exitMinuteVBox);

        VBox vBox = new VBox(10, appInfo,entryDateHBox,entryTimeHBox,exitDateHBox,exitTimeHBox,getFeeButton,feeLabel);
        vBox.setAlignment(Pos.TOP_LEFT);
        Scene scene = new Scene(vBox, 550, 400);
        stage.setTitle("Parking Lot Application");
        stage.setScene(scene);
        stage.show();
    }


}
