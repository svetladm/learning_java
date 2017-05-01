package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 22.4.2017 г..
 */
public class p10_diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        if (n == 1){
            System.out.println("*");
        }else if (n == 2){
            System.out.println("**");
        }else if (n % 2 == 0) {
            System.out.print(repeatStr("-", (n - 2) / 2));
            System.out.print("**");
            System.out.println(repeatStr("-", (n - 2) / 2));
        } else if (n % 2 != 0) {
            System.out.print(repeatStr("-", (n - 1) / 2));
            System.out.print("*");
            System.out.println(repeatStr("-", (n - 1) / 2));
        }

//        for (int i = 1; i <=  ; i++) {
//
//        }
    }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
