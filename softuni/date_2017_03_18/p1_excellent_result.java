package date_2017_03_18;

import java.util.Scanner;

public class p1_excellent_result {

    public static class logic {

        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);
            double grade = Double.parseDouble(scanner.nextLine ());
            if (grade >= 5.50){
                System.out.println("Excellent!");
            }
        }
    }

}
