
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
        String fullName = PromptForName("Please enter your name ");

        //declare an array with elements using Full Name and split at between the "\\s" space of string
        String[] partOfName = fullName.split("\\s");

        //if the user only enters a first and last name.
        if(partOfName.length == 2) {
            String firstName = partOfName[0];
            String lastName = partOfName[1];

            //display individual names
            System.out.println();
            System.out.println("You entered a first and last name. \nYour name displayed in individual pieces");
            System.out.println("\tFirst: " + firstName);
            System.out.println("\tLast: " + lastName);
        }

        //if the user enters a first, middle and last name
        else if(partOfName.length == 3) {
            String firstName = partOfName[0];
            String middleName = partOfName[1];
            String lastName = partOfName[2];

            //display individual names
            System.out.println();
            System.out.println("You entered a first, middle, and last name. \nYour name displayed in individual pieces");
            System.out.println("\tFirst: " + firstName);
            System.out.println("\tMiddle: " + middleName);
            System.out.println("\tLast: " + lastName);
        }
    }

    public static String PromptForName(String prompt){
        System.out.print(prompt);
        String name = s.nextLine().trim();
        return name;
    }
}
