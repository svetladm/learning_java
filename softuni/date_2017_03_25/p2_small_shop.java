package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 25.3.2017 г..
 */
public class p2_small_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String product = scan.nextLine().toLowerCase();
        String city = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(quantity = quantity * 0.50);
            } else if (product.equals("water")) {
                System.out.println(quantity = quantity * 0.80);
            } else if (product.equals("beer")){
                System.out.println(quantity = quantity * 1.20);
            } else if (product.equals ("sweets")){
                System.out.println(quantity = quantity * 1.45);
            }else if (product.equals ("peanuts")){
                System.out.println(quantity = quantity * 1.60);
            }
        }else if (city.equals("plovdiv")){
            if (product.equals ("coffee")){
                System.out.println(quantity = quantity * 0.40);
            }else if (product.equals ("water")){
                System.out.println(quantity = quantity * 0.70);
            }else if (product.equals ("beer")){
                System.out.println(quantity = quantity * 1.15);
            }else if (product.equals ("sweets")){
                System.out.println(quantity = quantity * 1.30);
            }else if (product.equals ("peanuts")){
                System.out.println(quantity = quantity * 1.50);
            }
        }else{
            if (product.equals("coffee")){
                System.out.println(quantity = quantity * 0.45);
            }else if (product.equals("water")){
                System.out.println(quantity = quantity * 0.70);
            }else if (product.equals ("beer")){
                System.out.println(quantity = quantity * 1.10);
            }else if (product.equals ("sweets")){
                System.out.println(quantity = quantity *1.35);
            }else if (product.equals("peanuts")){
                System.out.println(quantity = quantity * 1.55);
            }
        }
    }
}

