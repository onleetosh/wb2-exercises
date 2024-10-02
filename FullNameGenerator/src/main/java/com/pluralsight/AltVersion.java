/*

Another approach: solution 3.
 */
package com.pluralsight;

import java.util.Scanner;

public class AltVersion {

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
        if (middle.isBlank()){
            middle = " ";
        }
        else {
            middle = " " + middle + " ";
        }
        //if the user does not have a suffix
      if(!suffix.isBlank()){
          suffix = ", " + suffix;
      }

      fullName = first + middle + last + suffix;

      /*
       middle = (middle.isBlank()) ? " " : " " + middle + " ";
       suffix = (suffix.isBlak()) ? " " : ", " + suffix;

       */

        //display output
        System.out.print("Your full name: " + fullName);

    }

    public static String Prompt(String prompt){
        System.out.print(prompt);
        return input.nextLine().trim();
    }
}