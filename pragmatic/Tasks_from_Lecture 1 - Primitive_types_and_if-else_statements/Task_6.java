/**
 * Enter 3 numbers from keyboard a1, a2 and a3. Change their values, so a1 = a2, a2 = a3 and a3 = a1 (old value).
 */

package com.company.Lecture_1;
import java.util. Scanner;

public class Task_6 {

    public static void main (String [] args){
        System.out.println ("Please enter a1: ");
        Scanner sc = new Scanner (System.in);
        int a1 = sc.nextInt ();
        System.out.println ("Please enter a2: ");
        int a2 = sc.nextInt ();
        System.out.println ("Please enter a3: ");
        int a3 = sc.nextInt ();

        int c;
        int d;
        c = a2;
        d = a3;

        a3 = a1;
        a1 = c;
        a2 = d;

        System.out.println ("a1 = " + a1 + ", " + "a2 = " + a2 + ", "+ "a3 = " + a3);
    }
}
