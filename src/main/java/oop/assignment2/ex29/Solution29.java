package oop.assignment2.ex29;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
import java.lang.String;

public class Solution29
{
    public static boolean isNumeric(String strNum)
    {
    if (strNum == null)
    {
        return false;
    }
    try
    {
        double d = Double.parseDouble(strNum);
    }
    catch (NumberFormatException nfe)
    {
        return false;
    }
    return true;
    }

    public static void main (String[] args)
    {
        // your code goes here
        Scanner input = new Scanner(System.in);
        String value;
        while(true)
        {
            System.out.print("What is the rate of return? ");
            value = input.nextLine();


            if((isNumeric(value) == true))
            {
                int x = Integer.parseInt(value);
                if (x != 0)
                {
                    System.out.println("it will take " + (72 / x) + " year to double your initial investment.");
                    break;
                }

                else
                {
                    System.out.println("Sorry this is not a valid input");
                }

            }
            else
            {
                System.out.println("Sorry this is not a valid input");
            }
        }
    }
}
