package date_2017_03_11;

import java.util.Scanner;

public class p8_triangle_area {

    public static class greetings {

        public static void main (String [] varargs){
            Scanner scanner = new Scanner (System.in);

            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine ());

            double area = a*h/2;

            System.out.printf("%.2f", area);
        }
    }
}
