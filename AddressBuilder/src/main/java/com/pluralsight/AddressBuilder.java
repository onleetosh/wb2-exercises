//In this exercise you will create a new application that accepts user input for
//customer information such as billing and shipping addresses. The input
//information should be concatenated into a single variable.
//Create a Java application named AddressBuilder. You will prompt the user for
//their Billing and shipping addresses. Instead of changing the value of a string,
//you will use a StringBuilder to dynamically build the string that holds all of the
// address information. Then print the information to the screen.

package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    static Scanner input = new Scanner(System.in);

    public static String PromptUser(String prompt){
        System.out.print(prompt);
        String userInput = input.nextLine().trim();
        return userInput;
    }

    public static void main(String[] args){

        StringBuilder addressInfo = new StringBuilder();

        //prompt user for information
        System.out.println("\nPlease provide the following information");
        String fullName = PromptUser("First and Last name: ");

        //prompt user for billing details
        System.out.println("\nEnter Billing Address:");
        String billingStreet = PromptUser("Street: ");
        String billingCity = PromptUser("City: ");
        String billingState = PromptUser("State: ");
        String billingZip = PromptUser("Zip Code: ");

        //Prompt user for shipping details
        System.out.println("\nEnter Shipping Address:");
        String shippingStreet = PromptUser("Street: ");
        String shippingCity = PromptUser("City: ");;
        String shippingState = PromptUser("State: ");;
        String shippingZip = PromptUser("Zip Code: ");;

        // Appending Billing details to StringBuilder
        StringBuilder billingInfo = new StringBuilder("\n\nBilling Address:");
       // billingInfo.append("\n" + billingStreet);
       // billingInfo.append("\n" + billingCity + ", ");
       // billingInfo.append(billingState + " ");
       // billingInfo.append(billingZip);
        billingInfo.append("\n" + billingStreet + "\n" + billingCity + ", " + billingState + " " + billingZip);

        // Appending Shipping details to StringBuilder
        StringBuilder shippingInfo = new StringBuilder("\n\nShipping Address:");
       // shippingInfo.append("\n" + shippingStreet);
       // shippingInfo.append("\n" + shippingCity + ", ");
       // shippingInfo.append(shippingState + " ");
       // shippingInfo.append(shippingZip);
        shippingInfo.append("\n" + shippingStreet + "\n" + shippingCity + ", " + shippingState + " " + shippingZip);

        //Display String built
        System.out.println("\n" + fullName + billingInfo + shippingInfo);

    }

}
