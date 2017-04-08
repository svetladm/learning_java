package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 29.3.2017 г..
 */
public class p11_cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String projection = scan.nextLine ();
        int r = Integer.parseInt (scan.nextLine ());
        int c = Integer.parseInt (scan.nextLine ());
        double result = 0;


        if (projection.equals ("Premiere")){
            result = r * c * 12;
            System.out.printf("%.2f %s", result, "leva");
        }else if (projection.equals ("Normal")){
            result = r * c * 7.5;
            System.out.printf("%.2f %s", result, "leva");
        }else if (projection.equals ("Discount")){
            result = r * c * 5;
            System.out.printf("%.2f %s", result, "leva");
        }
    }
}
