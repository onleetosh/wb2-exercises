package com.pluralsight;

public class RollDice {

    public static void main(String[] args) {
        
        Dice dice1, dice2;
        int result;

        dice1 = new Dice();
        dice2 = new Dice();

        dice1.roll();
        dice2.roll();

        int countTwo = 0;
        int countFour = 0;
        int countSix = 0;
        int countSeven = 0;


        for (int i=1;i<21; i++) {

            result = dice1.roll() + dice2.roll();

            System.out.println("Roll " + i + ": " + dice1.roll() + " + " + dice2.roll() + " = " + result);

            //track the number of time 2, 4, 6, and 7, were rolled
            switch (result) {
                case 2:
                    countTwo++;
                    break;
                case 4:
                    countFour++;
                    break;
                case 6:
                    countSix++;
                    break;
                case 7:
                    countSeven++;
                    break;
            }
        }

        //when the loop ends, display the counters.
        System.out.println("_______________________________________");
        System.out.println("\nNumber of times the sum of the two Dice equaled 2, 4, 6, or 7:");
        System.out.println("2 appeared: " + countTwo +   "  times");
        System.out.println("4 appeared: " + countFour +  "  times");
        System.out.println("6 appeared: " + countSix +   "  times");
        System.out.println("7 appeared: " + countSeven + "  times");


    }
}

