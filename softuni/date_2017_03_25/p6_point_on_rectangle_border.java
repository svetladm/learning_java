package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 26.3.2017 г..
 */
public class p6_point_on_rectangle_border {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());

        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        boolean isInX = x == x1
                || x == x2;
        boolean isInY = y == y1
                || y == y2;

        if((isInX && y >= y1 && y <= y2)
                || (isInY && x >= x1 && x <= x2)){
            System.out.println("Border");
        }else{
            System.out.println("Inside / Outside");
        }
    }
}