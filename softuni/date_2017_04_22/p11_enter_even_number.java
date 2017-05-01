package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 23.4.2017 г..
 */
public class p11_enter_even_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        while (true){

            try{
                System.out.print("Enter even number: ");
                n = Integer.parseInt(scan.nextLine ());

                if(n % 2 != 0) {
                    System.out.println("The number is not even.");
                }else{
                    break;
                }

            }catch (Exception e){
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Even number entered: " + n);

//        int n = 1;
//
//       do{
//
//        try{
//            n = Integer.parseInt(scan.nextLine ());
//
//            if(n % 2 != 0) {
//                System.out.println("The number is not even.");
//            }
//
//        }catch (Exception e){
//            System.out.println("Invalid number!");
//        }
//
//       }while (n % 2 != 0);
//
//        System.out.println("Even number entered: " + n);
    }
}
