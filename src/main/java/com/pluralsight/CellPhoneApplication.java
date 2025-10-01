package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        CellPhone phone = new CellPhone(123456789, "iPhone 17", "Xfinity Mobile", "412-999-6789", "Daniel Spezialetti");
        phone.phoneInformation();
        System.out.println();

        System.out.println("\n*** Enter in the second phone's information ***");
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
        System.out.println();
        phone2.phoneInformation();
        System.out.println("\n\n");

        display(phone);
        System.out.println("\n");
        display(phone2);

    } // end of main

    public static void display(CellPhone phone) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a phone number you want to dial: ");
        String callNumber = keyboard.nextLine();
        phone.dial();
    }

}
