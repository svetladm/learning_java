package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetlana on 1.4.2017 г..
 */
public class p5_max_number {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int n = Integer.parseInt (scan.nextLine ());
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt (scan.nextLine ());
            if (num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}
