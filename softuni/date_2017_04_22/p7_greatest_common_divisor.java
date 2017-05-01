package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p7_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine ());
        int b = Integer.parseInt(scan.nextLine ());
//        int gcd = 1;
//
//        for (int i = 1; i <= b; i++) {
//            if (a % i == 0 && b % i == 0);
//            gcd = i;
//        }
//        System.out.println(gcd);

        for (int i = b; i >= 1; i --){
            if (a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
