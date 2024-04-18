package Assignments;

import java.util.Scanner;

/*
Take a input from user, input1, input2 as int and
ask the user what you want to do, enter char +,*,/ ,%, - ,
you will share the result by using the switch.
 */
public class Assign_30_04_01
{
    public static void main(String[] args)
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();

        System.out.println("Enter the second number");
        int num2= sc.nextInt();

        System.out.println("Which operation do you want to perform?");
        char operator = sc.next().charAt(0);

       // int result;

        switch (operator)
    {
        case '+':
            System.out.println("Result="+(num1 + num2));
            break;

        case '-':
            System.out.println("Result="+(num1 - num2));
            break;

        case '*':
            System.out.println("Result="+(num1 * num2));
            break;

        case '%':
            System.out.println("Result="+(num1 % num2));
            break;

        case '/':
            System.out.println("Result="+(num1 / num2));
            break;

        default:
            System.out.println("Invalid operator");
    }
    }
}
