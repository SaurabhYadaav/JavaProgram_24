package Assignments;
/*
Create a Program which takes arrays and print all the marks.
 */


import java.util.Scanner;

public class Assign_01_05_01
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
         int[] input=new int[5];//size=5

        System.out.println("Enter the marks of Physics :");
        input[0]=sc.nextInt();

        System.out.println("Enter the marks of Chemistry :");
        input[1]=sc.nextInt();

        System.out.println("Enter the marks of Maths :");
        input[2]=sc.nextInt();

        System.out.println("Enter the marks of English :");
        input[3]=sc.nextInt();

        System.out.println("Enter the marks of Hindi/Sanskrit :");
        input[4]=sc.nextInt();

        for(int i=0;i<input.length;i++)
        {
            if(input[i]<30)
            {
                System.out.println("Failed in Subject :"+input[i]);
                break;
            }
            System.out.println("Passed in subject"+input[i]);
        }
        sc.close();

    }
}
