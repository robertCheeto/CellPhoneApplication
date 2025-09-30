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
}

public int getSerialNumber() {
    return this.serialNumber;
}
