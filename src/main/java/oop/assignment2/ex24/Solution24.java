package oop.assignment2.ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */

import java.util.Scanner;

public class Solution24
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        anagramchecker obj = new anagramchecker();

        if(obj.isAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams");
        else
            System.out.println(str2 + " and " + str2 + " are not anagrams");
    }
}
