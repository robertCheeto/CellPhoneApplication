package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone phone = new CellPhone(123456789, "iPhone 17", "Xfinity Mobile", "412-999-6789", "Daniel Spezialetti");
        phone.phoneInformation();

        System.out.println("Enter in your phone information: ");
        System.out.print("Enter the Serial Number: ");
        int serialNumber = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter the phone model: ");
        String model = keyboard.nextLine();

        System.out.print("Enter the carrier: ");
        String carrier = keyboard.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = keyboard.nextLine();

        System.out.print("Enter the owner name: ");
        String owner = keyboard.nextLine();

        CellPhone phone2 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
        phone2.phoneInformation();

        display(phone);
        display(phone2);

    } // end of main

    public static void display(CellPhone phone) {
        Scanner keyboard = new Scanner(System.in);

//        CellPhone phone = new CellPhone(123456789, "iPhone 17", "Xfinity Mobile", "412-999-6789", "Daniel Spezialetti\n");
//        phone.phoneInformation();
//        CellPhone phone3 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);
//        phone3.phoneInformation();

        System.out.println("Please enter a phone number you want to dial: ");
        String callNumber = keyboard.nextLine();
        phone.dial(owner, callNumber);
        //phone3.dial(phone3.getPhoneNumber());
    }

}
