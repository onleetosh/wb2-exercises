/*
 Follow with instructor - solution 2

 */

package com.pluralsight;

import java.util.Scanner;

public class main {

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

        //if the user does not have a middle name
        if(middle.isBlank()) {
            if(suffix.isBlank()){
                fullName = first + " " + last;
            }
            else {
                fullName = first + " " + last + ", " + suffix;
            }
        }
        //if the user does not have a suffix
        else {
            if(suffix.isBlank()){
                fullName = first + " " + middle + " " + last;
            }
            else {
                fullName = first + " " + middle + " " + last + ", " + suffix;
            }
        }

        //display output
        System.out.print("Your full name: " + fullName);

    }

    public static String Prompt(String prompt){
        System.out.print(prompt);
        return input.nextLine().trim();
    }
}
