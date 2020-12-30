/**
 * Send message to the customer and read 2 numbers from keyboard A and B (they can be double).
 * Then read 3rd number C and check if C is between A and B. Send proper message that C is between A and B.
 */

package com.company.Lecture_1;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Please enter number A: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Please enter B: ");
        double b = sc.nextDouble();
        System.out.println("Please enter C: ");
        double c = sc.nextDouble();
        if (a > c && c < b) {
            System.out.println("The number " + c + " is between " + a + " amd " + b);
        } else {
            System.out.println("The number " + c + " is not between " + a + " and " + b);
        }
    }
}
