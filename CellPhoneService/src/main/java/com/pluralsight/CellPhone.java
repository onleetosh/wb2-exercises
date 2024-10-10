

package com.pluralsight;

public class CellPhone {

    //data members
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //constructor to create an object
    public CellPhone(long serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }


    //getter methods
    public long getSerialNumber() { return serialNumber; }
    public String getModel() { return model; }
    public String getCarrier() { return carrier; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getOwner() { return owner; }

    //setter methods
    public void setSerialNumber(long serialNumber) { this.serialNumber = serialNumber; }
    public void setModel(String model) { this.model = model; }
    public void setCarrier(String carrier) { this.carrier = carrier; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setOwner(String owner) { this.owner = owner; }
}
