//Another approach - using ONE Stringbuiler to form a string

package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder addressInfo = new StringBuilder();

        System.out.println("\nPlease provide the following information:");
        System.out.print("First and Last name: ");
        String fullName = input.nextLine().trim();

        //Prompt for Billing Address
        System.out.println("\nEnter your Billing Address:");
        System.out.print("Street: ");
        String billingStreet = input.nextLine().trim();
        System.out.print("City: ");
        String billingCity = input.nextLine().trim();
        System.out.print("State: ");
        String billingState = input.nextLine().trim();
        System.out.print("Zip Code: ");
        String billingZip = input.nextLine().trim();

        //Append billing details to StringBuilder
        addressInfo.append("Billing Address:\n");
        addressInfo.append(billingStreet).append("\n");
        addressInfo.append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n");

        //Prompt for Shipping Address
        System.out.println("\nEnter Shipping Address:");
        System.out.print("Street: ");
        String shippingStreet = input.nextLine().trim();
        System.out.print("City: ");
        String shippingCity = input.nextLine().trim();
        System.out.print("State: ");
        String shippingState = input.nextLine().trim();
        System.out.print("Zip Code: ");
        String shippingZip = input.nextLine().trim();

        //Append shipping details to StringBuilder
        addressInfo.append("\nShipping Address:\n");
        addressInfo.append(shippingStreet).append("\n");
        addressInfo.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");

        //Display String built
        System.out.println("\n" + fullName + "\n" + addressInfo.toString());
}
}
