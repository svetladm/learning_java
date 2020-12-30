/**
 * Rad 2 numbers from keyboard A and B. Print all numbers between A and B on 2nd grade separated with comma
 * (for example 1 * 1). If some number can be divided into 3, print message than the number is skipped "skip 3".
 * If the sum of all printed numbers (without the skipped ones) is bigger than 200, quiz the program.
 */

package com.company.Lecture_2;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Please enter number A:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println ("Please enter B:");
        int b = sc.nextInt ();

        int sum = 0;
        int multi;

        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }

        for (int i = a; i <= b; i = i + 1){
                multi = i * i;
                if (i % 3 == 0){
                    System.out.print ("skip " + i + ", ");
                }else{
                    sum = sum + multi;
                    if (sum > 200){
                        System.out.print (multi);
                        break;
                    }else{
                        System.out.print (multi + ", ");
                    }
                }
        }
    }
}
