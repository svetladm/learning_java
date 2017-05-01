package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetla on 11.04.17.
 */
public class p4_2_triangle_of_dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        for (int i = 0; i < n; i++) {
            System.out.print("$ ");
            for (int j = 0; j < i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}