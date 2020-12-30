/**
 * Please enter the numbers from 1 to n
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_3 {

    public static void main (String [] args){
        System.out.println ("Please enter a number:");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();

        int m = 1;

        if (n < 1){
            while (m >= n){
                System.out.println (m);
                m = m - 1;
            }
        }else{
            while (m <= n) {
                System.out.println(m);
                m = m + 1;
            }
        }
    }
}
