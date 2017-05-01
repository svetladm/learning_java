package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p8_factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int factorial = 1;

//        for (int i = 1; i <= n; i++) {
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);

        do{
            factorial = factorial * n;
            n--;
        }while(n >= 1);

        System.out.println(factorial);
    }
}
