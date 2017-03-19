package date_2017_03_11;

import java.util.Scanner;

public class p7_rectangle_area {

    static class greetings {
        private static Scanner scan;

        public static void main (String [] args) {
            scan = new Scanner(System.in);
            double x1 = Double.parseDouble(scan.nextLine());
            double y1 = Double.parseDouble(scan.nextLine());
            double x2 = Double.parseDouble(scan.nextLine());
            double y2 = Double.parseDouble(scan.nextLine());
            double width = Math.max(x1,x2) - Math.min(x1,x2);
            double height = Math.max(y1,y2) - Math.min(y1,y2);

            double S = width*height;
            double p = 2 * (height + width);

            System.out.println(S);
            System.out.println(p);

        }
    }

}
