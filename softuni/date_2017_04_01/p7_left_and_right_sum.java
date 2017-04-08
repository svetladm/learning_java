package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetlana on 1.4.2017 г..
 */
public class p7_left_and_right_sum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int sumleft = 0;
        int sumright = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine ());
            sumleft += num;
        }

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine ());
            sumright += num;
        }

        if (sumleft == sumright){
            System.out.println("Yes, sum = " + sumleft);
        }else if (sumleft != sumright){
            System.out.println("No, diff = " + Math.abs(sumleft - sumright));
        }
    }
}
