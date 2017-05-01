package date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 8.4.2017 г..
 */
public class p1_2_rectangle_of_10_x_10_stars {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print("*");

            if(i % 10 == 0){
                System.out.println();
            }
        }
    }
}
