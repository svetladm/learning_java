package date_2017_03_11;

import java.util.Scanner;

public class p11_usd_to_bgn {

    static class greetings {

        private static Scanner scan;

        public static void main (String [] args) {
            scan = new Scanner(System.in);
            double usd = Double.parseDouble(scan.nextLine());

            double bg = usd*1.79549;

            System.out.printf("%.2f", bg);

        }
    }
}
