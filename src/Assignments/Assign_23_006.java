package Assignments;

import java.util.Scanner;
/*
Write a program that prints numbers from 1 to 100.
 However, for multiples of 3, print "Fizz" instead of the number,
 and for multiples of 5, print "Buzz."
  For numbers that are multiples of both 3 and 5, print "FizzBuzz."
 */

public class Assign_23_006
{
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
*/
        for ( int num = 1; num <= 100; num++)
        {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FIZZBUZZ");
            } else if (num % 3 == 0) {
                System.out.println("FIZZ");
            } else if (num % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(num);
            }
        }
    }
}
