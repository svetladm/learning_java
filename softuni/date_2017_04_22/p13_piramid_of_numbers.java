package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 26.4.2017 г..
 */
public class p13_piramid_of_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int num = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                    System.out.print(num + " ");
                    num++;
                    if (num > n) {
                        break;
                    }
            }
            System.out.println();

                if (num > n) {
                    break;
                }
            }
        }
}


