/**
 * Depending on the entered from the keyboard number the following table should be printed:
 * n = 1       n = 2        n = 3           n = 4
 * print: 0    print: 11    print: 222      print: 3333
 *             print: 33    print: 444      print: 5555
 *                          print: 666      print: 7777
 *                                          print: 9999
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_10_for_loop {
    public static void main (String [] args){

        System.out.print ("Please enter positive number bigger than 0: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();

        while (n <= 0){
            System.out.print ("Please enter positive number bigger than 0: ");
            n = sc.nextInt();
        }

        int number = n - 1;

        for (int i = 1; i <= n; i = i + 1){
            for (int j = 1; j <= n; j = j + 1){
                System.out.print (number);
            }
            System.out.println ();
            number = number + 2;
        }
    }
}
