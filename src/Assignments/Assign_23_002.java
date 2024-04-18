package Assignments;

import java.util.Scanner;

/*
Program to Find the Largest Among Three Numbers:
 */
public class Assign_23_002
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();

        System.out.println("Enter num 3");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3)
        {
            System.out.println("Max is -> "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("Max is -> "+num2);
        }
        else
        {
            System.out.println("Max is ->"+num3);
        }
  /* we can use this in place of the if-else loop
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("Maximum number is"+max);
       */
    }

}
