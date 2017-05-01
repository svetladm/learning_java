package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p8_sunglasses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.print(repeatStr("*", 2 * n));
        System.out.print(repeatStr(" ", n));
        System.out.println(repeatStr("*", 2 * n));

        for (int i = 1; i <= n - 2; i++) {
            System.out.print("*");
            System.out.print(repeatStr("/", 2 * n - 2));
            System.out.print("*");
            if (n % 2 == 0 && i == (n / 2) - 1 || n % 2 != 0 && i == (n - 1) / 2){
                    System.out.print(repeatStr("|", n));
                } else {
                    System.out.print(repeatStr(" ", n));
                }
                System.out.print("*");
                System.out.print(repeatStr("/", 2 * n - 2));
                System.out.println("*");
            }
            System.out.print(repeatStr("*", 2 * n));
            System.out.print(repeatStr(" ", n));
            System.out.println(repeatStr("*", 2 * n));
        }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}

