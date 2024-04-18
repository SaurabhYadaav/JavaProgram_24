package Assignments;

import java.util.Scanner;
/*
Program to Check if a Number is Prime or Not
 */
public class Assign_23_005
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

        if(num/num==1 && num>1)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Non-Prime number");
        }

    }
}
