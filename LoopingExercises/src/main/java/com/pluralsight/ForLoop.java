package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException{

        //Use a for loop to display a countdown from 10 to 1
        System.out.println("Countdown begins in T-minus");
        for (int t = 10; t > 0; t--){
            System.out.println(t);
        }
        System.out.println("LAUNCH!");

    }

}
