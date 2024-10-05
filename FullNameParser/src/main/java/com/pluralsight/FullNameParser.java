
//   EXERCISE : Create a Java application called FullNameParser that prompts the user to enter a
//   name in one of the following two formats: first last or first middle last. Make sure to
//   trim the name before proceeding in case the user entered leading or trailing spaces.
//   TIP: Use "\\s" is to split a string by space


package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user for their name
        String fullName = PromptForName("Please enter your full name ");

        //declare an array with elements using Full Name and split between the "\\s" space of string
        String[] partOfName = fullName.split("\\s");

        //if the user only enters a first and last name.
        if(partOfName.length == 2) {
            String firstName = partOfName[0];
            String lastName = partOfName[1];

            //display individual names
            System.out.println("\nYou entered a first and last name \nHere is your name displayed in parts");
            System.out.println("\tFirst: " + firstName + "\n\tLast: " + lastName);

        }

        //if the user enters a first, middle and last name
        else if(partOfName.length == 3) {
            String firstName = partOfName[0];
            String middleName = partOfName[1];
            String lastName = partOfName[2];

            //display individual names
            System.out.println("\nYou entered a first, middle, and last name \nHere is your name displayed in parts");
            System.out.println("\tFirst: " + firstName + "\n\tMiddle: " + middleName + "\n\tLast: " + lastName);

        }
        else {
            String name = partOfName[0];
            System.out.println("\nSorry " + name + ", \nYou failed to enter a full name \n\tGoodbye!");
        }
    }

    public static String PromptForName(String prompt){
        System.out.print(prompt);
        String name = s.nextLine().trim();
        return name;
    }
}
