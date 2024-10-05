package com.pluralsight;

public class Dice {

    private final int maxFaceValueOfDie = 6;
    private int faceValue;

    //set the initial face value of a die
    public int Die() {
        faceValue = 1;
        return faceValue;
    }

    //roll the die and return a possible value
    public int roll(){
        faceValue = (int)(Math.random() * maxFaceValueOfDie) + 1;
        return  faceValue;
    }

}
