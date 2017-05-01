package learning_java.softuni.date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetlana on 12.4.2017 г..
 */
public class p6_rhombus_of_stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
                System.out.print(repeatStr(" ", n - i));
            System.out.println(repeatStr("* ", i));
        }
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(repeatStr(" ", i));
            System.out.println(repeatStr("* ", n - i));
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
