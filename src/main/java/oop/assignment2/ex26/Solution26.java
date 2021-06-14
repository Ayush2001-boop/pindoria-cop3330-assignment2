package oop.assignment2.ex26;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
import java.lang.Math;

public class Solution26
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double b;
        b = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double i;
        i = input.nextDouble();
        i = i / 100;
        i = i / 365;


        System.out.print("What is the monthly payment you can make ? ");
        double p;
        p = input.nextDouble();

        paymentcalculator obj = new paymentcalculator();

        System.out.printf("It will take you %.0f months to pay off this card.",Math.ceil(obj.calculateMonthsUntilPaidOff(b,i,p)));
    }
}
