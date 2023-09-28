package com.example.parkinglot;

public class ParkingLotController {

    private IParkingLot parkingLot;
    private ParkingLotView view;

    public ParkingLotController(IParkingLot parkingLot, ParkingLotView view) {
        this.parkingLot = parkingLot;
        this.view = view;

        configureFeeButton();
    }

    private void configureFeeButton() {
        view.getFeeButton().setOnAction((e) -> {
            try {
                String result = parkingLot.calculateFee(view.getEntryDateTime(), view.getExitDateTime());
                    view.displayFee(result);
            } catch (Exception exception) {
                view.displayFee("Invalid Inputs. Please check and try again");
            }
        });
    }
}
