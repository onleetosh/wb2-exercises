/*
    EXERCISE : Create a Java application called FullNameParser that prompts the user to enter a
    name in one of the following two formats: first last or first middle last.
    Make sure to trim the name before proceeding in case the user entered leading or
    trailing spaces.

 */

package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user for parts of their name
        String fullName = PromptForNames("Please enter your name");

        String firstName = getName.toString().split(0);
        String middleName = getName.toString();
        String lastName = getName.toString();




        //TODO: Parse the name and process it so that you can display the individual pieces of the name
        String[] partsOfName = fullName.split();

   /*
        //TODO: if the user does not have a middle name or suffix
        if(!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }
        fullName.append(" ").append(lastName);

        if(!suffix.isEmpty()){
            fullName.append(", ").append(suffix);
        } */

        //display the parts of name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);




    }

    public static String PromptForNames(String prompt){
        System.out.print(prompt);
        String name = s.nextLine().trim();
        return name;

    }
}
