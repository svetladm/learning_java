package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 25.3.2017 г..
 */
public class p3_point_in_rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        if(x >= x1 && x <= x2 && y >= y1 && y <= y2){
            System.out.println("Inside");
        }
        else{
            System.out.println("Outside");
        }
    }
}
