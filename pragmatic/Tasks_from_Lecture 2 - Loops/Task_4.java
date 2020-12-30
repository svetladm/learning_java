/**
 * Print all numbers from n to m
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_4 {

    public static void main (String [] args){
        System.out.println ("Please enter a number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();

        System.out.println ("Please enter another number:");
        int m = sc.nextInt ();

        if (n < m){
            while (m >= n){
                System.out.println (n);
                n = n + 1;
            }
        }else{
            while (m <= n) {
                System.out.println(m);
                m = m - 1;
            }
        }
    }
}
