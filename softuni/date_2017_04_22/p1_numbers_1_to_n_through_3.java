package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p1_numbers_1_to_n_through_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
}
