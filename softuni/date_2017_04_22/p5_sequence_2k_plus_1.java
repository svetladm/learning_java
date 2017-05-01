package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p5_sequence_2k_plus_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int num = 1;

        for (int i = 1; i <= n; i= 2 * i + 1) {
            System.out.println(i);
        }

//        while (num <= n ){
//            System.out.println(num);
//            num = num * 2 + 1;
//
//        }
    }
}
