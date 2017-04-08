package date_2017_03_18;

import java.util.Scanner;

class p15_equal_numbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        if (a==b){
            if (b==c){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("no");
        }

    }
}
