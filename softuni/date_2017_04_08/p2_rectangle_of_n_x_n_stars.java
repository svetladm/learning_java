package date_2017_04_08;

import java.util.Scanner;

/**
 * Created by svetla on 10.04.17.
 */
class p2_rectangle_of_n_x_n_stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(repeatStr("*", n));
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
