package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetlana on 1.4.2017 г..
 */
public class p4_sum_numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int n = Integer.parseInt (scan.nextLine ());
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            int a = Integer.parseInt (scan.nextLine ());
            sum += a;
        }
        System.out.println(sum);
    }
}
