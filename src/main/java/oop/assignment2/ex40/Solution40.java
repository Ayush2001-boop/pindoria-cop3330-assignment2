package oop.assignment2.ex40;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */

import java.lang.String;
import java.util.Scanner;
import java.util.Date;

public class Solution40
{
    public static void main(String[] args)
    {
        Record[] records = {
                new Record("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Record("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Record("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Record("Jake", "Jacobson", "Programmer", null),
                new Record("Jacquelyn", "Jockson", "DBA", null),
                new Record("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String target = input.nextLine();
        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Seperation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));

        for(Record record : records)
        {
            String temp;
            if(record.seperationDate == null)
                temp = "";
            else
                temp = record.seperationDate.toString();

            if(record.firstName.contains(target) || record.lastName.contains(target))
                System.out.printf("%-20s | %-20s | %-20s\n",  record.firstName + " " + record.lastName, record.position, temp);
        }
        input.close();
    }
}
