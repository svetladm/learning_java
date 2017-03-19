package date_2017_03_11;

import java.util.Scanner;

public class p10_radians_to_degrees {

    static class greetings {
        private static Scanner scan;

        public static void main (String [] args) {
            scan = new Scanner(System.in);
            double rad = Double.parseDouble(scan.nextLine());

            double deg = rad*180/Math.PI;

            System.out.println(Math.round(deg));

        }
    }
}
