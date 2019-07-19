package com.example.vendor_app.Sp_Technical_Support;

public class CallSummaryData {

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public CallSummaryData(String carModel, String numberPlate, String reason, String contactNumber, int carImg) {
        this.carModel = carModel;
        this.numberPlate = numberPlate;
        this.reason = reason;
        this.carImg = carImg;
        this.contactNumber = contactNumber;

    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getCarImg() {
        return carImg;
    }

    public void setCarImg(int carImg) {
        this.carImg = carImg;
    }

    private String carModel,numberPlate,reason,contactNumber;
    private int carImg;

}
