package com.pluralsight;

public class Vehicle {

    // data members
    long vehilceID;
    String makeModel;
    String color;
    int odometerReading;
    float price;

    // constructor
    public Vehicle(long vehilceID, String makeModel, String color, int odometerReading, float price) {
        this.vehilceID = vehilceID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // getters
    public long getVehilceID() { return vehilceID; }
    public String getMakeModel() { return makeModel; }
    public String getColor() { return color; }
    public int getOdometerReading() { return odometerReading; }
    public float getPrice() { return price; }

    // setters
    public void setVehilceID(long vehilceID) { this.vehilceID = vehilceID; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    public void setColor(String color) { this.color = color; }
    public void setOdometerReading(int odometerReading) { this.odometerReading = odometerReading; }
    public void setPrice(float price) { this.price = price; }
}
