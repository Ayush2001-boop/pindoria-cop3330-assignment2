package oop.assignment2.ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;
public class Solution25
{
    public static void main(String[] args)
    {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Password: ");
        str = input.nextLine();
        strengthofpass obj = new strengthofpass();
        String answer = obj.passwordValidator(str);
        System.out.println(answer);
    }
}
