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

        //display(phone);
        phone.dial(phone2.getPhoneNumber());
        System.out.println("\n");

    } // end of main()

    public static void display(CellPhone phone) {
        Scanner keyboard = new Scanner(System.in);
        CellPhone phone3 = new CellPhone();

        System.out.print("Please enter a phone number you want to dial: ");
        String phoneNumber = keyboard.nextLine();
        phone3.setPhoneNumber();
        phone.dial(phone3.getPhoneNumber());
        //phone3.dial(phone.getPhoneNumber());
    } // end of display()

} // end of CellPhoneApplication Class
