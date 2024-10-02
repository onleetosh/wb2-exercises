package com.pluralsight;

import java.util.Scanner;

public class ALTSolution {

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        String fullName = Prompt("Enter FULL name: ");

        int indexOfFirstSpace = fullName.indexOf(' ');
        String first = fullName.substring(0, indexOfFirstSpace);
        String endingPart = fullName.substring(indexOfFirstSpace + 1);
            int indexOfSpaceInEndingPart = endingPart.indexOf(" ");
        String middle = " ";
        String last =  " ";

        if(indexOfSpaceInEndingPart < 0) {
            //dont have a middle name
            last = endingPart;
        }
        else {
            middle = endingPart.substring(0, indexOfSpaceInEndingPart);
            last = endingPart.substring(indexOfSpaceInEndingPart +1);
        }


        System.out.println("Here is what you entered");
        System.out.println("First: " + first);
        System.out.println("Middle: " + middle);
        System.out.println("Last: " + last);

    }

    public static String Prompt(String prompt) {
        System.out.println(prompt);
        String name = s.nextLine().trim();
        return name;
    }
}
