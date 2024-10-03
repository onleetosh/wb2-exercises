//Create a Java application called TheaterReservations. This application is used to
//allow customers to reserve tickets for a specific date.
//Prompt the user for their full name, the date of the show, and the number of
//tickets they will need. Once the reservation is made, display a confirmation message to the customer in
//this format: # ticket(s) reserved for (date) under (LastName, FirstName)
// If only one ticket is reserved, the confirmation should not include an "s"


package com.pluralsight;

import java.util.Scanner;

public class TheaterReservation {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] arg) {

        //prompt user for information
        String name = Prompt("Please enter your name ");
        String movieDate = Prompt("What date will you be coming (MM/dd/yyyy): ");
        String numberOfTickets = Prompt("How many tickets would you like: ");

        //display confirmation

    }

    public static String Prompt(String prompt) {
        System.out.print(prompt);
        String userInput = input.nextLine().trim();
        return userInput;
    }
}
