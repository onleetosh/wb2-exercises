/*

Another approach to FullNameGenerator
 */
package com.pluralsight;

import java.util.Scanner;

public class Alt3{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        //ask user for their name
        System.out.println("Enter your name");

        //declare variables and prompt for input
        String first = Prompt("First name: ");
        String middle = Prompt("Middle name: ");
        String last = Prompt("Last name: ");
        String suffix = Prompt("Suffix: ");

        String fullName;



        //using ternary operators
       middle = (middle.isBlank()) ? " " : " " + middle + " "; 
       suffix = (suffix.isBlank()) ? " " : ", " + suffix;

        fullName = first + middle + last + suffix;


        //display output
        System.out.print("Your full name: " + fullName);

    }

    public static String Prompt(String prompt){
        System.out.print(prompt);
        return input.nextLine().trim();
    }
}