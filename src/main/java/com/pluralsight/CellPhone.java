package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
}

public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
    this.serialNumber = serialNumber;
    this.model = model;
    this.carrier = carrier;
    this.phoneNumber = phoneNumber;
    this.owner = owner;
}

public CellPhone() {
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.owner = "";
}

public int getSerialNumber() {
    return this.serialNumber;
}

public int setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
}

public void phoneInformation() {
    System.out.printf("%s is the owner of the %s with the Serial Number of %d", owner, model, serialNumber);
}
