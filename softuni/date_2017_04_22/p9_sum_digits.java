package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p9_sum_digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            n = n / 10; // n/=10
            sum = sum + temp;
        }
        System.out.println(sum);
    }
}
