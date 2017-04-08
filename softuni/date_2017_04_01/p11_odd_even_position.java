package date_2017_04_01;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by svetlana on 2.4.2017 г..
 */
public class p11_odd_even_position {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int n = Integer.parseInt(scan.nextLine());
        double oddsum = 0;
        double evensum = 0;
        double oddmin = Double.MAX_VALUE;
        double evenmin = Double.MAX_VALUE;
        double oddmax = Integer.MIN_VALUE;
        double evenmax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scan.nextLine());

            if (i % 2 == 0) {
                oddsum += num;
                if (num < oddmin) {
                    oddmin = num;
                }
                if (num > oddmax) {
                    oddmax = num;
                }
            } else {
                evensum += num;
                if (num < evenmin) {
                    evenmin = num;
                }
                if (num > evenmax) {
                    evenmax = num;
                }
            }
        }
        System.out.println("OddSum = " + df.format (oddsum));
        if (oddmin == Double.MAX_VALUE) {
            System.out.println("OddMin = No");
        }else{
            System.out.println("OddMin = " + df.format(oddmin));
        }
        if (oddmax == Integer.MIN_VALUE) {
            System.out.println("OddMax = No");
        }else{
            System.out.println("OddMax = " + df.format (oddmax));
        }
        System.out.println("EvenSum = " + df.format (evensum));
        if (evenmin == Double.MAX_VALUE) {
            System.out.println("EvenMin = No");
        }else{
            System.out.println("EvenMin = " + df.format (evenmin));
        }
        if (evenmax == Integer.MIN_VALUE) {
            System.out.println("EvenMax = No");
        } else{
            System.out.println("EvenMax = " + df.format (evenmax));
        }
    }
}

