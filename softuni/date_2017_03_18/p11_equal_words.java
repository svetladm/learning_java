package date_2017_03_18;

import java.util.Scanner;


class p11_equal_words {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String text1 = scan.nextLine().toLowerCase();
        String text2 = scan.nextLine().toLowerCase();

        if (text1.equals (text2)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
