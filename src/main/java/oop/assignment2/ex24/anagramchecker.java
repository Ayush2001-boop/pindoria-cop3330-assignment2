package oop.assignment2.ex24;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
public class anagramchecker
{
    static boolean isAnagram(String str1, String str2)
    {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        if (status) {
            return true;
        } else {
            return false;
        }
    }
}
