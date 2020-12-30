/**
 * Enter two different numbers from console and print them in increasing order.
 */

package com.company.Lecture_1;
import java.util.Scanner;

public class Task_4 {

    public static void main (String [] args){
        System.out.println ("Please enter number A:");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        System.out.println ("Please enter number B:");
        int b = sc.nextInt ();

        if (a > b){
            System.out.println (a);
            System.out.println (b);
        }else{
            System.out.println (b);
            System.out.println (a);
        }
    }
}
