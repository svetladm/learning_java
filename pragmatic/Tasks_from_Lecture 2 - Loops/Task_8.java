/**
 * Read a number from keyboard and print the sum of all numbers between 1 and the number entered from keyboard.
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_8 {
    public static void main (String [] args){
        System.out.println ("Please enter a number: ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();

        int i;
        int sum = 0;

        for (i = 1; i <= a; i = i + 1){
            sum = sum + i;
        }
        System.out.println ("Sum is " + sum);
    }
}
