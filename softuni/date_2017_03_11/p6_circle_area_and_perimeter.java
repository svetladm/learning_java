package date_2017_03_11;

import java.util.Scanner;

public class p6_circle_area_and_perimeter {

    static class SquareArea {
        public static void main (String [] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("r= ");
            double r = Double.parseDouble(scan.nextLine());

            double area = Math.PI*r*r;
            System.out.println("area= " + area);

            double perimeter = 2*Math.PI*r;
            System.out.println("perimeter= " + perimeter);


        }
    }
}
