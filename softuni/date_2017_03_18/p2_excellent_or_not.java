package date_2017_03_18;

import java.util.Scanner;

public class p2_excellent_or_not {

    public static class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            double grade = Double.parseDouble(scan.nextLine ());
            if (grade>=5.50) {
                System.out.println("Excellent!");
            }
            else{
                System.out.println ("Not excellent.");
            }
        }
    }

}
