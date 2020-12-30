/**
 * Enter two different numbers from console and change their values. Print their new values.
 */

package com.company.Lecture_1;
import java.util.Scanner;

public class Task_3 {

    public static void main (String [] args){
        System.out.println ("Please enter number A:");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        System.out.println ("Please enter number B:");
        int b = sc.nextInt ();

        int c;

          c = a;
          a = b;
          b = c;

        System.out.println ("Number A is " + a);
        System.out.println ("Number B is " + b);
    }
}
