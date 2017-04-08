package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 25.3.2017 г..
 */
public class p1_personal_titles {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double age = Double.parseDouble (scan.nextLine ());
        String gender = scan.nextLine ();

        if (age<16) {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else {
                System.out.println("Master");
            }
        }else{
            if (gender.equals("f")){
                System.out.println("Ms.");
            } else{
                System.out.println("Mr.");
            }
        }
    }
}

