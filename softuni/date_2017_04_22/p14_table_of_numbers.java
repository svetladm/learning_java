package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 30.4.2017 г..
 */
public class p14_table_of_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int num = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                num = row + col + 1;
                if (num > n){
                    num = 2*n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
