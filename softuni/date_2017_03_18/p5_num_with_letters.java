package date_2017_03_18;

import java.util.Scanner;

public class p5_num_with_letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine ());

        if (num>0) {

            if (num == 1) {
                System.out.println("one");
            } else if (num == 2) {
                System.out.println("two");
            } else if (num == 3) {
                System.out.println("three");
            } else if (num == 4) {
                System.out.println("four");
            } else if (num == 5) {
                System.out.println("five");
            } else if (num == 6) {
                System.out.println("six");
            } else if (num == 7) {
                System.out.println("seven");
            } else if (num == 8) {
                System.out.println("eight");
            } else if (num == 9) {
                System.out.println("nine");
            } else if (num == 10) {
                System.out.println("ten");
            } else {
                System.out.println("The number is too big.");
            }
        }
        else {
            System.out.println("Please enter positive number");
        }
    }
}
