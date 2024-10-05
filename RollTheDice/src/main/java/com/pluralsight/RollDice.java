package com.pluralsight;

public class RollDice {

    public static void main(String[] args) {

        //declare two die referencing Dice class and initialize them
        Dice die1, die2;
        die1 = new Dice();
        die2 = new Dice();

        //call the roll method and roll die
        die1.roll();
        die2.roll();

        //declare variables for the reoccurrence of 2, 4, 6, or 7
        int countTwo = 0;
        int countFour = 0;
        int countSix = 0;
        int countSeven = 0;

        //loop to perform 100 dice rolls
        for (int i = 1; i < 101; i++) {

            int sumOfDice = die1.roll() + die2.roll();

            System.out.println("Roll #" + i + ": " + die1.roll() + " + " + die2.roll() + " = " + sumOfDice);

            //increment the number of times dice roll equaled 2, 4, 6, or 7
            switch (sumOfDice) {
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
        //display the counters.
        System.out.println("-----------NO MORE ROLLS-----------");
        System.out.println("When Dice roll equaled 2, 4, 6, or 7");
        System.out.println("2 appeared: " + countTwo +   " times");
        System.out.println("4 appeared: " + countFour +  " times");
        System.out.println("6 appeared: " + countSix +   " times");
        System.out.println("7 appeared: " + countSeven + " times \n\nLets GO Again!");

    }
}

