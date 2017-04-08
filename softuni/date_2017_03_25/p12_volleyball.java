package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 31.3.2017 г..
 */
public class p12_volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String year = scan.nextLine ();
        int p = Integer.parseInt (scan.nextLine ());
        int h = Integer.parseInt (scan.nextLine ());

        double saturday = (48 - h) * 3.0/4;
        double holiday = p * 2.0/3;
        double sum = saturday + holiday + h;
        double result = 0;

        if (year.equals ("leap")){
            result = sum + (sum * 0.15);
            System.out.println(Math.floor (result));
        }else if (year.equals ("normal")){
            System.out.println(Math.floor (sum));
        }
    }
}
