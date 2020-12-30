/**
 * Enter three different numbers from console and print them in decreasing order.
 */

package com.company.Lecture_1;
import java.util.Scanner;

public class Task_5 {

    public static void main (String [] args){
        System.out.println ("Please enter number A: ");
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        System.out.println ("Please enter number B: ");
        int b = sc.nextInt ();
        System.out.println ("Please enter number C: ");
        int c = sc.nextInt ();

        if (a > b && a > c && b > c){
            System.out.println (a + " , " + b + " , " + c);
            if (b > a && b > c && a > c){
                System.out.println (b + " , " + a + " , " + c);
            }if (c > b && c > a && a > b){
                System.out.println (c + " , " + a + " , " + b);
            }if (a > c && a > b && c > b){
                System.out.println (a + " , " + c + " , " + b);
            }if (b > a && b > c && c > a){
                System.out.println (b + " , " + c + " , " + a);
            }
        }else{
            System.out.println (c + " , " + b + " , " + a);
        }
    }
}
