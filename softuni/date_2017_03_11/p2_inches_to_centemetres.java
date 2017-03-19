package date_2017_03_11;

import java.util.Scanner;

public class p2_inches_to_centemetres {

    public static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            double inches = Double.parseDouble (scanner.nextLine());

            double centimetres = inches*2.54;

            System.out.println(centimetres);

        }
    }
}
