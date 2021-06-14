package oop.assignment2.ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */

import java.lang.String;
import java.util.Scanner;

public class Solution31
{
    // checking if string is number
    public static boolean isNumeric(String input)
    {

        try {
            Integer.parseInt(input);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // creating scanner class instance
        Scanner input = new Scanner(System.in);

        int restingPulse;
        int age;

        // reading resting pulse until valid input
        while(true) {
            // reading input
            System.out.print("Enter Resting Pulse : ");
            String x = input.next();

            // checking if input is number
            if(isNumeric(x)) {
                restingPulse = Integer.parseInt(x);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }

        }

        // reading resting pulse until valid input
        while(true) {
            // reading input
            System.out.print("Enter Age : ");
            String y = input.next();

            // checking if input is number
            if(isNumeric(y)) {
                age = Integer.parseInt(y);
                break;
            }else {
                System.out.println("Invalid Age");
            }

        }


        System.out.println("Resting Pulse: " + restingPulse + "       Age: " + age);
        System.out.println("Intensity | Rate ");
        System.out.println("----------|-------------");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5)
        {
            int rate = ((220 - age - restingPulse) * intensity/100) + restingPulse;
            System.out.println(intensity+"%       | "+rate +" bpm");
        }




        input.close();

    }



}
