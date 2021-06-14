package oop.assignment2.ex25;

import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
public class strengthofpass
{
    public static String passwordValidator(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;

        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }


        if (hasDigit && (hasLower || hasUpper) && specialChar && (n >= 8))
            return "Very Strong";

        else if ((hasLower || hasUpper || hasDigit) && (n >= 8))
            return "Strong";

        else if(hasLower || hasUpper && (n < 8))
            return "Weak";

        else
            return "Very Weak";

    }
}
