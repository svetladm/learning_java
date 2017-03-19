package date_2017_03_18;

import java.util.Scanner;

public class p3_odd_or_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt (scan.nextLine ());
        if (a % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
