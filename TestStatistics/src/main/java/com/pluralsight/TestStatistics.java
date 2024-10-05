package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        //create an array with 10 elements
        int[] tenScores = {89, 92, 100, 72, 95, 90, 79, 65, 98, 85};

        //declare variables
        int elementsInArray = 10;
        int sum=0;
        int highScore = tenScores[0];
        int lowScore = tenScores[0];

        //loop through array to find the sum, high and low score
        for (int score : tenScores){
            sum += score;
            if (score > highScore) {
                highScore = score;
            }
            if (score < lowScore) {
                lowScore = score;
            }
        }

        int average = sum / elementsInArray;

        //use a for-each loop to prints all element in an array
        System.out.println("Test Scores:");
        //each element in the array is assigned to the variable "score"
        for (int score : tenScores) {
            System.out.print(score + " "); //and prints, followed by " " space
        }
        //display results
        System.out.println("\nAverage:  " +    average);
        System.out.println("Highest: " +  highScore);
        System.out.println("Lowest:  " +   lowScore);
    }
}
