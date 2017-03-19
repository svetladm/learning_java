package date_2017_03_11;

import java.util.Scanner;

public class p9_celsius_to_fahrenfeit {


    static class greetings {
        private static Scanner scan;

        public static void main (String [] args) {
            scan = new Scanner(System.in);
            double celsius = Double.parseDouble(scan.nextLine());

            double fahrenheit = celsius*1.8 + 32;

            System.out.printf("%.2f",fahrenheit);

        }
    }
}
