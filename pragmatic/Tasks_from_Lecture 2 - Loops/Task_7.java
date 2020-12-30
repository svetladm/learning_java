/**
 * Enter two numbers from keyboard. Print all numbers between smaller and bigger one.
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_7 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println ("Please enter number A: ");
        int a = sc.nextInt ();

        System.out.println ("Please enter number B: ");
        int b = sc.nextInt ();

        if (a < b){
           int i = a;
            for (i = a; i <= b; i = i + 1){
                System.out.print (i + " ");
            }
            }else {
            int i = b;
            for (i = b; i <= a ; i = i + 1){
                System.out.print (i + " ");
            }
        }
    }
}
