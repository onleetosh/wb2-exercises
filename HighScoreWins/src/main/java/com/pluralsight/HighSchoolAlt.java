/*
 A different approach with substring and Pattern.

 */
package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighSchoolAlt {

    static Scanner input = new Scanner(System.in);

    public static String Prompt(String prompt){
        System.out.println(prompt + "(ex. Nets:Bulls | 95:102 )");
        String userInput = input.nextLine().trim();
        return userInput;
    }

    public static void main(String[] args){
        String gameInformation = Prompt("Please enter a game score ");

        int indexOfBar = gameInformation.indexOf("|");

        String afterBar = gameInformation.substring(indexOfBar +1);

        String[] scores = afterBar.split(Pattern.quote(":"));
        //convert String to integer
        int leftScore = Integer.parseInt(scores[0]);
        int rightScore = Integer.parseInt(scores[1]);

        boolean isLeftWinner = ( leftScore > rightScore);

        String teamNameString = gameInformation.substring(0, indexOfBar);
        String[] teamName = teamNameString.split(Pattern.quote(":"));

        if(isLeftWinner) {
            System.out.println(teamName[0] + " wins! Score: " + scores[0]);

        }
        else {
            boolean isRightWinner = (leftScore < rightScore);
            if(isRightWinner) {
                System.out.println(teamName[1] + "wins! Score: " + scores[1]);
            }
            else {
                System.out.println("Its a tie!");
            }
        }


    }

}
