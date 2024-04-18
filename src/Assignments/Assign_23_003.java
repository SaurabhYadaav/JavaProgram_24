package Assignments;

import java.util.Scanner;
/*
Program to Check if a Character is a Vowel or a Consonant.
 */
public class Assign_23_003
{
    public static <Char> void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        char ch=sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }


    }
}
