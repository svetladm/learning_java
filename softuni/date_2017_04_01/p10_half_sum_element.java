package date_2017_04_01;

import java.util.Scanner;

/**
 * Created by svetlana on 2.4.2017 г..
 */
public class p10_half_sum_element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scan.nextLine ());
            if (num > max){
                max = num;
            }
            sum += num;
        }

        if ((sum - max) == max){
            System.out.println("Yes Sum = " + max);
        }else{
            System.out.println("No Diff = " + Math.abs(max - (sum - max)));
        }
    }
}
