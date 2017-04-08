package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 29.3.2017 г..
 */
public class p10_animal_type {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String animal = scan.nextLine ();

        if (animal.equals ("dog")){
            System.out.println("mammal");
        }else if (animal.equals ("crocodile")
                || animal.equals ("tortoise")
                || animal.equals ("snake")){
            System.out.println("reptile");
        }else{
            System.out.println("unknown");
        }
    }
}
