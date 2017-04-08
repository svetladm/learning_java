package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetla on 05.04.17.
 */
class p12_equal_pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int diff = 0;
        int sumnew = 0;
        int sumold = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());

            System.out.println("num1: " + num1);
            System.out.println("num2: " + num2);

            sumnew = num1 + num2;
            System.out.println("sumnew: " + sumnew);
            System.out.println("sumold: " + sumold);

            if (i >= 1) {
                diff = sumnew - sumold;
                if (diff < 0) {
                    diff = diff - 2 * diff;
                }
                System.out.println("diff: " + diff);
                if (diff > max) {
                    max = diff;
                }
            }
            sumold = sumnew;
            System.out.println("sumold: " + sumold);
            System.out.println();
        }
        if (max <= 0) {
            System.out.println("Yes, value = " + sumnew);
        } else{
            System.out.println("No maxdiff = " + max);
        }
    }
}
