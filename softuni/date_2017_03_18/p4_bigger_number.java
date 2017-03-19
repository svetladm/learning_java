package date_2017_03_18;

import java.util.Scanner;

public class p4_bigger_number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int a = Integer.parseInt(scan.nextLine ());
        int b = Integer.parseInt(scan.nextLine ());

        if (a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
