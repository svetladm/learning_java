package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p3_powers_of_two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        int num = 1;
        System.out.println("1");

        for (int i = 1; i <= n; i++) {
            num = num*2;
            System.out.println(num);

        }
    }
}
