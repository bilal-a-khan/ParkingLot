package com.example.parkinglot;

public class ParkingLotController {

    private ParkingLot parkingLot;
    private ParkingLotView view;

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    //private ParkingLotFactory factory = new ParkingLotFactory();

    public ParkingLotController(ParkingLot parkingLot, ParkingLotView view) {
        this.parkingLot = parkingLot;
        this.view = view;

        configureFeeButton();
    }

    private void configureFeeButton() {
        view.getFeeButton().setOnAction((e) -> {
            setParkingLot(ParkingLotFactory.createParkingLot(view.getLotToggleOption()));
            try {
                String result = parkingLot.calculateFee(view.getEntryDateTime(), view.getExitDateTime());
                    view.displayFee(result);
            } catch (Exception exception) {
                view.displayFee("Invalid Inputs. Please check and try again");
            }
        });
    }
}
