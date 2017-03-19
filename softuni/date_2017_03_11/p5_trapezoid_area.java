package date_2017_03_11;

import java.util.Scanner;

public class p5_trapezoid_area {

    static class SquareArea {
        public static void main (String [] args) {
            Scanner scan = new Scanner(System.in);
            double b1 = Double.parseDouble(scan.nextLine());
            double b2 = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            double area = (b1+b2)*height/2;

            System.out.println (area);

        }
    }
}
