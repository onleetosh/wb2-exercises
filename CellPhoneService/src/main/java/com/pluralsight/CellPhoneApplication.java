

package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to CellPhone Application! " +
                "\nPlease provide me with the following information when prompted\n");

        //Prompt user by calling PromptUser method
        String model = PromptUser("Model: ");
        String serialString = PromptUser("Serial number: ");
        String carrier = PromptUser("Carrier: ");
        String phoneNumber = PromptUser("Phone number: ");
        String owner = PromptUser("Owner: ");

        // Convert serial number to integer
        long serialNumber = Integer.parseInt(serialString);

        // Create a new instance of CellPhone
        CellPhone phone = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        // Print the phone's properties using getters
        System.out.println("\nCellPhone Information:\n");
        System.out.println("\tSerial Number: " + phone.getSerialNumber());
        System.out.println("\tModel: " + phone.getModel());
        System.out.println("\tCarrier: " + phone.getCarrier());
        System.out.println("\tPhone Number: " + phone.getPhoneNumber());
        System.out.println("\t Owner: " + phone.getOwner());
    }

    //method prompting user
    public static String PromptUser(String prompt){
        System.out.print(prompt);
        String userInput = input.nextLine().trim();

        return userInput;
    }

}
