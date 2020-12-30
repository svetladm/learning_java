/**
 * Enter three variables from keyboard - hour (int type), amount money (double type), if you are sick - boolean type.
 * Create a program, which decides based on these data in the following way:
 * - if I am sick, I will not go out;
 * - if I have money I will buy medicines;
 * - if I don't have money, I will stay at home and will drink tea;
 * - if I am not sick and I have less than 10 lv. will go to the cafe ect.
 * Show the decision as a message in console.
 */

package com.company.Lecture_1;
import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        System.out.println("Please enter hour:");
        Scanner sc = new Scanner(System.in);
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
