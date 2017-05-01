package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p7_1_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine ());
        int b = Integer.parseInt(scan.nextLine ());

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}
