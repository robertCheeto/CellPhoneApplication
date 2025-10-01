package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model, carrier, phoneNumber, owner;
//    private String carrier;
//    private String phoneNumber;
//    private String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    } // CellPhone Constructor

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    } // Parameterless Constructor | ask Topher what this does/means for better clarity

    public int getSerialNumber() {
        return this.serialNumber;
    } // Getter for serialNumber()

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    } // Setter for serialNumber()

    public String getModel(String model) {
        return this.model;
    } // Getter for model()

    public void setModel() {
        this.model = model;
    } // Setter for model();

    public String getCarrier() {
        return this.carrier;
    } // Getter for carrier()

    public void setCarrier() {
        this.carrier = carrier;
    } // Setter for carrier()

    public String getPhoneNumber() {
        return this.phoneNumber;
    } // Getter for phoneNumber()

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    } // Setter for phoneNumber()

    public String getOwner() {
        return this.owner;
    } // Getter for owner()

    public void setOwner() {
        this.owner = owner;
    } // Setter for owner()

    public void phoneInformation() {
        System.out.printf("%s is the owner of the %s with the Serial Number of %d", owner, model, serialNumber);
    } // Display Message for phoneInformation

    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s", getOwner(), phoneNumber);
    }

}