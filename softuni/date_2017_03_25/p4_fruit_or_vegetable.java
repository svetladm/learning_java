package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 26.3.2017 г..
 */
public class p4_fruit_or_vegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        String product = scan.nextLine ();

        if (product.equals ("banana")
                || product.equals ("apple")
                || product.equals ("kiwi")
                || product.equals ("cherry")
                || product.equals ("lemon")
                || product.equals ("grapes")){
            System.out.println("fruit");
        }else if(product.equals ("tomato")
                || product.equals ("cucumber")
                || product.equals ("pepper")
                || product.equals ("carrot")){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }
    }
}
