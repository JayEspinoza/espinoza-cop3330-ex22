/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 Julian Espinoza
 *
 *  Exercise 22 - Comparing Numbers
 *  Write a program that asks for three numbers. Check first to see that all numbers are different.
 *  If they’re not different, then exit the program. Otherwise, display the largest number of the three.
 *
 *  Constraint:
 *  Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
 *
 */

package ex22;
import java.util.Scanner;

public class base {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String [] args)
    {
        // Variable Initialization
        base myBase = new base();
        int num1 = myBase.numEnter1();
        int num2 = myBase.numEnter2();
        int num3 = myBase.numEnter3();

        // Output
        myBase.numDetermine(num1, num2, num3);
    }

    // Functions numEnter1-numEnter3 take user input to return an int value
    public int numEnter1()
    {
        int num;
        System.out.printf("Enter the first number: ");
        num = userInput.nextInt();
        return num;

    }

    public int numEnter2()
    {
        int num;
        System.out.printf("Enter the second number: ");
        num = userInput.nextInt();
        return num;
    }

    public int numEnter3()
    {
        int num;
        System.out.printf("Enter the third number: ");
        num = userInput.nextInt();
        return num;
    }

    // Function determines the largest number and outputs it
    public void numDetermine(int num1, int num2, int num3)
    {
        int printNum;

        // If statements set printNum depending on which
        // Value is the largest
        if(num1 > num2 && num1 > num3)
        {
            printNum = num1;
        }
        else if(num2 > num1 && num2 > num3)
        {
            printNum = num2;
        }
        else
        {
            printNum = num3;
        }

        // Output
        System.out.printf("The largest number is %d.", printNum);
    }
}
