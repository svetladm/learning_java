//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

import java.util.Scanner;

public class Task_1 {
    public Task_1() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number A: ");
        double a = sc.nextDouble();
        System.out.println("Please enter B: ");
        double b = sc.nextDouble();
        System.out.println("Please enter C: ");
        double c = sc.nextDouble();
        if(a > c && c < b) {
            System.out.println("The number " + c + " is between " + a + " and " + b);
        } else {
            System.out.println("The number " + c + " is not between " + a + " and " + b);
        }

    }
}
