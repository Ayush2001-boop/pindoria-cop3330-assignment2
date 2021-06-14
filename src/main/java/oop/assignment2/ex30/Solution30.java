package oop.assignment2.ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */

import java.lang.String;

public class Solution30
{
    public static void main(String[] args)
    {
        for(int i = 1 ; i <= 12; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                if(i >= 2)
                {
                    if(i*j <=9)
                        printline5(i,j);

                    else if(i*j >=10 && i*j <=99)
                        printline4(i,j);

                    else if(i*j >=100)
                        printline3(i,j);
                }

                else
                {
                    if(i*j <=9)
                        printline5(i,j);

                    else if(i*j >=10 && i*j <=99)
                        printline4(i,j);
                }
            }

            System.out.println();
        }
    }

    public static void printline5(int i, int j)
    {
        System.out.print("     " + i*j);
    }
    public static void printline4(int i, int j)
    {
        System.out.print("    " + i*j);
    }
    public static void printline3(int i, int j)
    {
        System.out.print("   " + i*j);
    }

}
