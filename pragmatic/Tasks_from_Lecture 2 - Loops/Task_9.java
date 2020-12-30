/**
 * Starting from 3, print first n numbers which can be divided to 3. Print the numbers separated with comma.
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_9 {
    public static void main (String [] args){
        System.out.println ("Please enter n: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();

        int i;

        for (i = 1; i < n * 3; i = i + 1){
            if (i % 3 == 0){
                System.out.print (i + ", ");
            }
        }
        System.out.print (n * 3);
    }
}
