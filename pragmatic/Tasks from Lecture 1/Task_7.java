package com.company.Lecture_1;

import java.util.Scanner;

public class Task_7 {
    public Task_7() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter hour:");
        int a = sc.nextInt();
        System.out.println("Please enter amount of money:");
        double b = sc.nextDouble();
        System.out.println("Please share if you are sick:");
        boolean c = sc.nextBoolean();

        if (c == true) {
            System.out.println("I am not going out.");
            if (b > 0) {
                System.out.println("I will buy medicines.");
            }else {
                System.out.println("I will stay at home and drink tea.");
            }
        }else {
            if (b < 10 && b > 0) {
                System.out.println("I will go to cafe.");
            }
            if (b > 10) {
                System.out.println("I will go to the cinema.");
            }
            if (b <= 0) {
                System.out.println("I will go for a walk.");
            }
        }
    }
}
