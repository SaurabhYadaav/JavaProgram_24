package Assignments;

import java.util.Scanner;

/*
Program to Check if a Year is a Leap Year or Not:
 */
public class Assign_23_004
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year =sc.nextInt();

        if(year % 4==0)
        {
            System.out.println("Leap year"+year);
        }
        else
        {
            System.out.println("Non-Leap Year");
        }

    }
}
