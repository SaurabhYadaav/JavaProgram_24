package Assignments;

import java.util.Scanner;

/*
Program to Check if a Number is Positive, Negative, or Zero.
 */
public class Assign_23_001
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0)
        {
            System.out.println("Positive Number");
        }
        else if(a<0)
        {
            System.out.println("Negative Number");
        }
        else
        {
            System.out.println("Zero Number");
        }

    }
}
