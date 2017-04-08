package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 1.4.2017 г..
 */
public class p_13_point_in_the_figure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());

        int x1 = 0;
        int x2 = 3 * h;
        int y1 = 0;
        int y2 = h;

        int x3 = h;
        int y3 = h;
        int x4 = 2 * h;
        int y4 = 4 * h;

        if (x > x1 && x < x2 && y > y1 && y < y2){

        }
    }
}