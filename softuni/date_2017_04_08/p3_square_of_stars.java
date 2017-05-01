package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetla on 10.04.17.
 */
public class p3_square_of_stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
