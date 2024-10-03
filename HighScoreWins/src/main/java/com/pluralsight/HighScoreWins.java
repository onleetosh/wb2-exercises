//Create a new Java application called HighScoreWins that prompts the user to
//enter team and score information of an event. The input will be a single string
//that contains both team names and the final score of the match.
//Prompt the user for a game score.
//The user will input a score in the following format:    Home:Visitor|21:9
//Based on the user input, you should determine which team had the higher score
//and display the name of the winning team.

package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        //prompt user for information
        String gameInformation = Prompt("Please enter a game score ");

        //Declare an array to separate the two parts of data (Team and Score)
        String[] data = gameInformation.split("\\|");  // .split(separate string on "|")
        String teamNamePart = data[0];
        String teamScorePart = data[1];

        //declare an array to hold names and score
        String[] teamName = teamNamePart.split(":");
        String[] teamScore = teamScorePart.split(":"); // .split(separate string on ":")

        //assigning variables by referring to elements in the array
        String homeTeam = teamName[0];
        String awayTeam = teamName[1];

        //Parse(convert) score(String input) into integers
        int homeScore = Integer.parseInt(teamScore[0]);
        int awayScore = Integer.parseInt(teamScore[1]);

        //determine the winner
        if (homeScore > awayScore) {
            System.out.println("WINNER! " + homeTeam);
        }
        else if(homeScore < awayScore) {
            System.out.println("WINNER! " + awayTeam);
        }
        else {
            System.out.println("TIE !");
        }
    }

    //method used to prompt for user input
    public static String Prompt(String prompt){
        System.out.println(prompt + "(ex. Nets:Bulls | 95:102 )");
        String userInput = input.nextLine().trim();
        return userInput;
    }
}
