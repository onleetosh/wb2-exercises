package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        //create an array with 10 elements
        int[] tenScores = {89, 92, 100, 72, 95, 90, 79, 65, 98, 85};

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


        int average = sum / 10;




       // System.out.print(Arrays.toString(tenScores));
        System.out.println("Test Scores:");
        for (int score : tenScores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage:  " +    average);
        System.out.println("Highest: " +  highScore);
        System.out.println("Lowest:  " +   lowScore);
    }



}
