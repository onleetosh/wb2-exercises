package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        //prompt user for parts of their name
        System.out.println("Please enter your name");
        String firstName = PromptForNames("First name: ");
        String middleName = PromptForNames("Middle name: ");
        String lastName = PromptForNames("Last name: ");
        String suffix = PromptForNames("Suffix: ");


        //TODO: make a string to output full name
        StringBuilder fullName = new StringBuilder(firstName);


        //TODO: if the user does not have a middle name or suffix
        if(!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }
        fullName.append(" ").append(lastName);

        if(!suffix.isEmpty()){
            fullName.append(", ").append(suffix);
        }

        //display the full name
        System.out.println("Your full name: " + fullName.toString());





    }

    public static String PromptForNames(String prompt){
        System.out.print(prompt);
        String name = s.nextLine().trim();
        return name;

    }
}
