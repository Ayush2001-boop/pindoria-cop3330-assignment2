package oop.assignment2.ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */

import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class Solution33
{
    public static String ask()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question?");
        String ques = input.nextLine();
        return ques;
    }
    public static void main(String[] args)
    {

        String[] responses = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();

        Scanner input = new Scanner(System.in);


       String question = ask();

        int randomResponseIndex = random.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
    }
}
