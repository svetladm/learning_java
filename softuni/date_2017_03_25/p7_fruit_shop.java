package date_2017_03_25;

import java.util.Scanner;

/**
 * Created by svetlana on 28.3.2017 г..
 */
public class p7_fruit_shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine().toLowerCase();
        String day = scan.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scan.nextLine());

        if (day.equals("monday")
                || day.equals("tuesday")
                || day.equals("wednesday")
                || day.equals("thursday")
                || day.equals("friday")) {
            if (fruit.equals("banana")) {
                System.out.println(quantity * 2.50);
            } else if (fruit.equals("apple")) {
                System.out.println(quantity * 1.20);
            } else if (fruit.equals("orange")) {
                System.out.println(quantity * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(quantity * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quantity * 2.70);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quantity * 5.50);
            } else if (fruit.equals("grapes")) {
                System.out.println(quantity * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("saturday")
                || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(quantity * 2.70);
            } else if (fruit.equals("apple")) {
                System.out.println(quantity * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.println(quantity * 0.90);
            } else if (fruit.equals("grapefruit")) {
                System.out.println(quantity * 1.60);
            } else if (fruit.equals("kiwi")) {
                System.out.println(quantity * 3.00);
            } else if (fruit.equals("pineapple")) {
                System.out.println(quantity * 5.60);
            } else if (fruit.equals("grapes")) {
                System.out.println(quantity * 4.20);
            }else{
                System.out.println("error");
            }
        }else{
            System.out.println("error");
        }
    }
}
