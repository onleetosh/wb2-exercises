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

        System.out.println("\nStarting Movie Reservation");

        //prompt user for information
        String fullName = PromptForInput("\nPlease enter first and last name: ");
        String movieDate = PromptForInput("What date will you be coming (MM/dd/yyyy): ");
        String numberOfTickets = PromptForInput("How many tickets would you like? ");

        //declare an array for parts of name and split where at the " " space
        String[] partsOfName = fullName.split(" ");
        String firstName = partsOfName[0];  //set firstname equal to first element in the array
        String lastName = partsOfName[1];  //set last name equal to second element in the array

        //convert the number entered as a String to an integer
        int ticket = Integer.parseInt(numberOfTickets);

        //build a string with set variables
        StringBuilder confirmation = new StringBuilder();

        //if the user enters 0 tickets
        if (ticket == 0){
            System.out.println("\nYou reserved 0 tickets. Have a good day.");
        }
        //If user enters 1 ticket
        if (ticket == 1) {
            confirmation.append(numberOfTickets + " ticket reserved for ");
            confirmation.append(movieDate + " under ");
            confirmation.append(lastName + ", " + firstName);
        }

        //If the user enters more than 1 ticket
        else {
            confirmation.append(numberOfTickets + " tickets reserved for ");
            confirmation.append(movieDate + " under ");
            confirmation.append(lastName + ", " + firstName);
        }

        //display confirmation
        System.out.println("\nConfirmation: " + confirmation);
    }

    public static String PromptForInput(String prompt) {
        System.out.print(prompt);
        String userInput = input.nextLine().trim();
        return userInput;
    }
}
