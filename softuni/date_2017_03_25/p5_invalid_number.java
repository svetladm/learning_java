package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 26.3.2017 г..
 */
public class p5_invalid_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int a = Integer.parseInt (scan.nextLine ());

        if (!(a >= 100 && a <= 200 || a == 0)){
            System.out.println("invalid");
        }
    }
}
