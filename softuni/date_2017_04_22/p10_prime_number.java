package learning_java.softuni.date_2017_04_22;

import java.util.Scanner;

/**
 * Created by svetlana on 23.4.2017 г..
 */
public class p10_prime_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {

            }
            for (int i = 2; i < n; i++) {
//            for (int i = 2; i < Math.sqrt(n); i++) { //square root
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}

