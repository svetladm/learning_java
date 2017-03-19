package date_2017_03_18;

import java.util.Scanner;

public class p6_bonus_points {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine ());
        double bonus = 0;

        if(num <= 100){
            bonus = bonus + 5;
        }
        else if (num > 1000){
            bonus = bonus + num * 0.1;
        }
        else if (num > 100){
            bonus = bonus + num * 0.2;
        }
        if (num % 2 == 0){
            bonus = bonus + 1;
        }
        else if (num % 10 == 5){
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
