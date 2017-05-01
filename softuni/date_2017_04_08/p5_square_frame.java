package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 12.4.2017 г..
 */
public class p5_square_frame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        for (int i = 0; i < n - 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < n - 2; j++) {
               System.out.print("- ");
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < n - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
