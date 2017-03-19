package date_2017_03_11;

import java.util.Scanner;

public class p1_square_area{

    static class SquareArea {
        public static void main (String [] args) {

            Scanner console = new Scanner (System.in);
            System.out.print ("a= ");

            int a = Integer.parseInt (console.nextLine());
            int area = a*a;
            System.out.println ("Square= " + area);


        }
    }

}
