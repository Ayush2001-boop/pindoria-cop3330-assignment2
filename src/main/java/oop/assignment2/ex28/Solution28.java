package oop.assignment2.ex28;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class Solution28
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int s = findsum();

        System.out.println("The total is " + s);
    }

    public static int findsum()
{   Scanner input = new Scanner(System.in);
    int sum = 0;
    int element;
    for(int i = 0 ; i < 5 ; i++)
    {
        System.out.print("Enter the value: ");
        element = input.nextInt();
        sum += element;
    }
    return sum;
}

}
