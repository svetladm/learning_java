package com.company;


import java.util.Scanner;

public class sum_seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int sum = 0;
        sum = a + b + c;

        if (sum < 60) {
            if (sum < 10) {
                System.out.println("0:" + "0" + sum);
            } else {
                System.out.println("0:" + sum);
            }
        } else if (sum < 120) {
            if ((sum - 60) < 10) {
                System.out.println("1:" + "0" + (sum - 60));
            } else {
                System.out.println("1:" + (sum - 60));
            }
        } else if (sum < 180) {
            if ((sum - 120) < 10) {
                System.out.println("2:" + "0" + (sum-120));
            } else {
                System.out.println("2:" + (sum - 120));
            }
        }
    }
}
