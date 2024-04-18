package Assignments;

import java.util.Scanner;

/*
Program to Find the Largest Among Three Numbers:
 */
public class Assign_23_002
{
    public static void main(String[] args)
    {
        System.out.println("Enter num 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
       // System.out.println("Max by Math.max func() " + max);

        System.out.println("Enter num 3");
        int num3 = sc.nextInt();
       // System.out.println("Max by Math.max func() " + max);

        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is the largest number");
        }
        else if(num1<num2 && num1<num3)
        {
            System.out.println("num1 is the smallest number");
        }
        else
        {
            System.out.println("num1 is greater then num2 and less than num3");
        }

    }
}
