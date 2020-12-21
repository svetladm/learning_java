package com.company;
import java.util.Scanner;

public class Task_2 {
    public Task_2(){
    }

    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("Please enter number A: ");
    int a = sc.nextInt ();
    System.out.println ("Please enter number B: ");
    int b = sc.nextInt ();

    int c = a + b;
    int d = a - b;
    int e = a * b;
    int f = a / b;
    int g = a % b;

    System.out.println ("Sum is " + c);
    System.out.println ("Margin is " + d);
    System.out.println ("Product is " + e);
    System.out.println ("Division is " + f);
    System.out.println ("Remainder is " + g);

    Scanner scan = new Scanner (System.in);
    System.out.println ("Please enter number S: ");
    double s = scan.nextDouble ();
    System.out.println ("Please enter number T: ");
    double t = scan.nextDouble ();

    double p = s + t;
    double r = s - t;
    double k = s * t;
    double m = s / t;
    double n = s % t;

    System.out.println ("Sum is " + p);
    System.out.println ("Margin is " + r);
    System.out.println ("Product is " + k);
    System.out.println ("Division is " + m);
    System.out.println ("Remainder is " + n);
    }

}
