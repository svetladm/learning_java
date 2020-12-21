package com.company.Lecture_1;
import java.util. Scanner;

public class Task_6 {
    public Task_6 (){
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter a1: ");
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
