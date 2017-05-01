package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 23.4.2017 г..
 */
public class p6_number_in_range_1_to_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        while (n < 1 || n > 100){
            System.out.println("Invalid number!");
            System.out.print("Enter a number in the range [1...100]: ");
            n = Integer.parseInt(scan.nextLine());
        }
        System.out.println("The number is: " + n);
    }
}
