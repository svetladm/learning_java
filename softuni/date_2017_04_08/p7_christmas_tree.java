package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 21.4.2017 г..
 */
public class p7_christmas_tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine ());

        for (int i = 0; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            System.out.print(repeatStr("*", i));
            System.out.print(" | ");
            System.out.println(repeatStr("*", i));
            }

        }
    static String repeatStr(String strToRepeat, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
